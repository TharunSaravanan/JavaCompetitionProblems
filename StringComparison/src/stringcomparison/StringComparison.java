package stringcomparison;

/**
 * Compares two strings and return ASCII character difference of first different characters
 * @author tharun
 */
public class StringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String a = "and";
        String b = "zut";

        int equal = 0;        
        int count = 0;
        
        if (a.length() < b.length()){           
            count = a.length();
        }
        else {
            count = b.length();
        }
        
        for (int i = 0; i < count; i++) {

            if (a.charAt(i) > b.charAt(i)) {
                equal = a.charAt(i)-b.charAt(i);               
                break;
            } 
            else if (a.charAt(i) < b.charAt(i)) {
                equal = b.charAt(i)-a.charAt(i);             
                break;
            }

        }

        System.out.println(equal);

    }

}
