package AST;

import javax.lang.model.element.Element;
import java.util.ArrayList;

public class Program {
 public    ArrayList<Import> imports;
 public    ArrayList<Export> exports;
 public    ArrayList<Variable> variables;

 public ArrayList<Function> functions;
 public ArrayList<Element> elements;
 public Program(){

    imports=new ArrayList<>();
    variables=new ArrayList<>();
    exports=new ArrayList<>();
    functions=new ArrayList<>();
elements=new ArrayList<>();
 }
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        //    *imports
        for (var var :imports){
           stringBuilder.append(var);
           stringBuilder.append('\n');
        }
        // *variables
        for (var var :variables){
           stringBuilder.append(var);
           stringBuilder.append('\n');
        }
        for (var var :exports){
            stringBuilder.append(var);
            stringBuilder.append('\n');
        }
        for (var var :functions){
            stringBuilder.append(var);
            stringBuilder.append('\n');
        }
        for (var var :functions){
            stringBuilder.append(var);
            stringBuilder.append('\n');
        }
        for (var var :elements){
            stringBuilder.append(var);
            stringBuilder.append('\n');
        }

        return stringBuilder.toString();
    }
}
