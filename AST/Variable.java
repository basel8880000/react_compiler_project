package AST;

public class Variable {
   public String id;
 public String type;
 public Object value;

    public Variable() {

    }

    @Override
    public String toString() {
        return "Variable{" +
                id +" : "+value+
                '}';
    }
}
