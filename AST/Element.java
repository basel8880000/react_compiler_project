package AST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Element {
    public String tagName;


    public Map<String, Object> attributes;
    public int line;
    public ArrayList<Element> children;
   public boolean isSelfClose=false;
    // ... (other fields and methods)
public Element(){
    attributes=new HashMap<>();
    children=new ArrayList<>();
}

    @Override
    public String toString() {
        StringBuilder jsxBuilder = new StringBuilder();
        jsxBuilder.append("<").append(tagName);
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            jsxBuilder.append(" ").append(entry.getKey()).append("={").append(entry.getValue()).append("}");
        }
        if (isSelfClose) {
            jsxBuilder.append("/>");
        } else {
            jsxBuilder.append(">\n");
            for (Element child : children) {
                jsxBuilder.append(child.toString());
            }
            jsxBuilder.append("</").append(tagName).append(">\n");
        }
        return jsxBuilder.toString();
    }
}
