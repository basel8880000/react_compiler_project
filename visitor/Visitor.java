package visitor;

import AST.*;
import SymbolTable.SymboleTable;
import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Visitor extends ReactParserBaseVisitor {
    SymboleTable symboleTable = new SymboleTable();

    @Override
    public Object visitProg(ReactParser.ProgContext ctx) {
        Program program = new Program();

        for (ReactParser.ImpContext imp : ctx.imp()) {
            program.imports.add(visitImp(imp));
        }

        for (ReactParser.DeclContext var : ctx.decl()) {
            program.variables.add(visitDecl(var));
        }

        for (ReactParser.AssignContext var : ctx.assign()) {
            visitAssign(var);
            program.variables = symboleTable.variableList;
        }
        for (ReactParser.FunContext var : ctx.fun()) {

            program.functions.add(visitFun(var));
        }

if(ctx.fun().get(0).funBody().return_().get(0).val().jsx().element()!=null){
  visitElement(  ctx.fun().get(0).funBody().return_().get(0).val().jsx().element());
}
        if (ctx.export() != null) {
            program.exports.add(visitExport(ctx.export()));
        }


        return program;
    }

    @Override
    public Element visitElement(ReactParser.ElementContext ctx) {
      if(ctx==null) return new Element();
        Element element = new Element();
        if(ctx.emptyElement() != null &&ctx.emptyElement().CLOSETAG()==null) {
            element.tagName="";
            for (var x :ctx.emptyElement().content()){
                System.out.println(ctx.emptyElement().content());
               var var1= visitElement(x.element());
               element.children.add(var1);
            }

        } else if (ctx.normalElement() != null) {

            element.tagName=ctx.normalElement().NORMALELEMENT(0).getText();
            if(ctx.normalElement().attribute().size()>0){
            for (var x :ctx.normalElement().attribute()) {
                element.attributes.put(x.getChild(0).getText(), visitVal(x.val()).value);
            }
            }
            for(var x :ctx.normalElement().content()){
               var var1= visitElement(x.element());
              element.children.add(var1);
            }
        } else if (ctx.imgElement() != null) {

            element.tagName=ctx.imgElement().getText();
            if(ctx.imgElement().attribute()!=null){
                for (var x :ctx.imgElement().attribute()) {
                    element.attributes.put(x.getChild(0).getText(), visitVal(x.val()).value);
                }
            }

        } else if (ctx.component() != null&&ctx.emptyElement().CLOSETAG()==null) {

            element.tagName=ctx.normalElement().getText();
            if(ctx.component().comAttribute()!=null){
                for (var x :ctx.normalElement().attribute()) {
                    element.attributes.put(x.ID().getText(), visitVal(x.val()).value);
                }
            }

        }
return element;
    }

    @Override
    public Element visitJsx(ReactParser.JsxContext ctx) {
            Element element = new Element();

            return element;
        }



    @Override
    public Function visitFun(ReactParser.FunContext ctx) {
      Function function=new Function();
      function.name=ctx.ID().getText();
      symboleTable.addSymbol(function.name,ctx);

      return  function;
    }

    @Override
    public Import visitImp(ReactParser.ImpContext ctx) {
        Import imp = new Import();
        imp.importedFile = ctx.STRING().toString();
        if (ctx.varimp() != null) {
            for (var var : ctx.varimp().ID()) {
                System.out.println( ctx.varimp().ID().toString());
symboleTable.addSymbol(var.getText(),ctx);
                imp.imported.add(var.getText());

            }
        }
        return imp;
    }

    @Override
    public Object visitNormalElement(ReactParser.NormalElementContext ctx) {
        return super.visitNormalElement(ctx);
    }

    @Override
    public Variable visitAssign(ReactParser.AssignContext ctx) {
        Variable var = new Variable();
symboleTable.checkSymbolIsDeclared(ctx.ID().getText(),ctx);
        for (int i = 0; i < symboleTable.variableList.size(); i++) {
            if (Objects.equals(ctx.ID().getText(), symboleTable.variableList.get(i).id)) {
                var = visitVal(ctx.val());
                var.id = ctx.ID().getText();
                symboleTable.variableList.set(i, var);

                break;
            }
        }
        return var;
    }

    @Override
    public Variable visitDecl(ReactParser.DeclContext ctx) {
        Variable var = new Variable();
        var.id = ctx.ID().getText();
        symboleTable.addSymbol(var.id,ctx);
        if (ctx.val().ID() != null) {
            for (Variable variable : symboleTable.variableList) {
                if (Objects.equals(ctx.val().ID().getText(), variable.id)) {
                    var.value = variable.value;
                    break;
                }
            }
        } else if (ctx.val().valObjList() != null) {
            //value from object
            if (ctx.val().valObjList().DOT() != null) {
                String s = ctx.val().valObjList().getChild(2).getText();
                for (Variable variable : symboleTable.variableList) {
                    if (Objects.equals(ctx.val().valObjList().getChild(0).getText(), variable.id)) {
                        var.value = ((Map<String, Object>) variable.value).get(s);
                        break;
                    }
                }

            }
            //value from list
            else {
                int n = (visitExp(ctx.val().valObjList().exp())).intValue();
                for (Variable variable : symboleTable.variableList) {
                    if (Objects.equals(ctx.val().valObjList().getChild(0).getText(), variable.id)) {
                        var.value = ((ArrayList) variable.value).get(n);
                        break;
                    }
                }
            }
        }
        //expression vlaue
        else {
            var = visitVal(ctx.val());
            var.id = ctx.ID().getText();
        }

        symboleTable.variableList.add(var);
        return var;
    }

    @Override
    public Variable visitVal(ReactParser.ValContext ctx) {

        Variable variable = new Variable();

        if (ctx.STRING() != null) {
            variable.type = "string";
            variable.value = ctx.STRING().getText();

        } else if (ctx.BOOLEAN() != null) {
            variable.type = "bool";
            variable.value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        } else if (ctx.list() != null) {
            List list = new List();
            Variable var1 = new Variable();
            ArrayList a = new ArrayList();
            for (int i = 0; i < ctx.list().varlist().val().size(); i++) {
                var1 = visitVal(ctx.list().varlist().val().get(i));
                list.variableList.add(var1);
            }
            for (var x : list.variableList) {
                a.add(x.value);
            }

            variable.value = a;
        } else if (ctx.obj() != null) {
            Map<String, Object> map = new HashMap<>();
            Variable var1 = new Variable();
            String key;
            for (int i = 0; i < ctx.obj().varObj().val().size(); i++) {
                var1 = visitVal(ctx.obj().varObj().val().get(i));
                key = ctx.obj().varObj().ID().get(i).getText();
                map.put(key, var1.value);
            }

            variable.value = map;
        } else if (ctx.exp() != null) {

            variable.value = visitExp(ctx.exp());
            variable.type = "number";
        }
else if(ctx.jsx()!=null){
  variable.value=  ctx.jsx();
  variable.type="jsx";
        }
        return variable;
    }

    @Override
    public Double visitExp(ReactParser.ExpContext ctx) {
        if (ctx.num() != null) {

            return Double.parseDouble(ctx.num().getText());

        } else if (ctx.ID() != null) {

            for (Variable variable : symboleTable.variableList) {
                if (Objects.equals(ctx.ID().getText(), variable.id)) {
                    return Double.parseDouble(variable.value.toString());

                }
            }

            return 0.0;
        } else {

            double left = visitExp(ctx.exp(0));
            double right = visitExp(ctx.exp(1));

            if (ctx.MULT() != null) {
                return left * right;
            } else if (ctx.DIV() != null) {
                return left / right;
            } else if (ctx.ADD() != null) {
                return left + right;
            } else { // SUB
                return left - right;
            }
        }
    }
    @Override
    public Export visitExport(ReactParser.ExportContext ctx) {
        Export export = new Export();
        export.exportedFile = ctx.ID().getText();
        return export;
    }
}