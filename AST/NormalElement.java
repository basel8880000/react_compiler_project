package AST;

import java.util.ArrayList;
import java.util.List;

public class NormalElement extends Element {
    public String tagName;
    public ArrayList<String> attributes;
    List<VoidElement> elements;
    String Content;
NormalElement(){
    elements=new ArrayList<>();
    attributes=new ArrayList<>();
}
}
