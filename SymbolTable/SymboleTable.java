package SymbolTable;

import AST.Function;
import AST.List;
import AST.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SymboleTable {
    private Map<String, ParserRuleContext> symbolTable;
    public ArrayList<Variable> variableList;
  // public ArrayList<List> lists=new ArrayList<>();
   public ArrayList<Function> functionList;

   public SymboleTable (){
      functionList=new ArrayList<>();
      variableList =new ArrayList<>();
      symbolTable =new HashMap<>();
   }
    public void addSymbol(String name, ParserRuleContext ctx) {
        if (symbolTable.containsKey(name)) {
throw new RuntimeException("the variable "+name +" is already defined");        } else {
            symbolTable.put(name, ctx);
        }
    }
    public void checkSymbolIsDeclared(String name, ParserRuleContext ctx) {
        if (!symbolTable.containsKey(name)) {
throw new RuntimeException("the variable "+name +" is not declared");        }
    }

}
