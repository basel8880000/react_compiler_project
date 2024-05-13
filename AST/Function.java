package AST;

import java.lang.reflect.TypeVariable;

public class Function {

   public String name;
   public  Element returnValue;
   public String returnType;

public Function(){

}

   @Override
   public String toString() {
      StringBuilder stringBuilder=new StringBuilder();

           stringBuilder.append(returnValue);
         stringBuilder.append('\n');

      return "Function{" +
              "name='" + name + '\'' +'\n'+
stringBuilder.toString()
              ;
   }
}
