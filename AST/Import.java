package AST;

import java.util.ArrayList;

public class Import {
public String importedFile;
public ArrayList<String> imported;

    public Import() {
imported=new ArrayList<>();
    }

    @Override
    public String toString() {
        if(imported.size()>0){
        return "Import{" +
                " imported : " + imported +
                " , from : " + importedFile + '\'' +

                '}';}
    else {
            return "Import{" +
                    " import from : " + importedFile + '\'' +

                    '}';
        }
    }


}
