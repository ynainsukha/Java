package helper;

/**
 *
 * @author Yash Nainsukha
 */
import java.util.LinkedList;

public class JavaChallenge {

    /**
     * @param string the input string
     * @return number of sub-string if string can be divided into equal sub-strings 
     */
    public static int getEquiSubStringCount(String mString){
        String sequence = "";
        int string_count = 0;
        for(int i = 0; i<mString.length()/2; i++) {
            sequence = sequence + mString.charAt(i);
            if (mString.matches("("+sequence+")*")) {
                string_count = string.length()/sequence.length();
                break;
            }
        }
        return string_count;
    }   
}

