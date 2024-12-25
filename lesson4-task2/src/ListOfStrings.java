import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfStrings {
    private List<String> stroki = new ArrayList<String>();
    public void addstr(String str){
        int a = 0;
        if (stroki.isEmpty()){
            stroki.add(str);
        } else {
            if (stroki.getFirst().length() > str.length()){
                stroki.addFirst(str);
            } else {
                for (int i = 0; i < stroki.size(); i++) {
                    if (stroki.get(i).length() < str.length()) {
                        a = i;
                    }
                }
                stroki.add(a+1, str);
            }
        }
    }
    public void maxelement(){
        System.out.println(stroki.getLast());
    }
    public void median_length(){
        double dl=0.0;
        for (int i=0; i<stroki.size(); i++){
            dl += stroki.get(i).length();
        }
        System.out.println(dl/stroki.size());
    }

    public List<String> getStroki() {
        return stroki;
    }
}
