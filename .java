package helper;

/**
 *
 * @author Yash Nainsukha
 */
import java.util.LinkedList;

public class JavaHelper {

    /**
     * @param string the input string
     * @return number of sub-string if string can be divided into equal sub-strings 
     */
    public static int getEquiSubStringCount(String string){
        String sequence = "";
        int ans = 0;
        for(int i = 0; i<string.length()/2; i++) {
            sequence = sequence + string.charAt(i);
            if (string.matches("("+sequence+")*")) {
                ans = string.length()/sequence.length();
                break;
            }
        }
        return ans;
    }   
}

