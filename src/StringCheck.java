import java.lang.String.*;

/**
 * Class StringCheck is implemented to compare two strings
 * of a potential arbitrary length, too store and output the
 * number of character differences between the two strings.
 */

public class StringCheck {

    /**
     * Method compareString takes @param str1, string
     * and @param str2, string,
     * Compares and @return int defining the number of differing characters between the strings.
     * It also checks that the lengths are equivalent at runtime.
     */

    private int compareString(String str1, String str2) {

        int strLength = str1.length();
        int str2Length = str2.length();
        int retVal = 0;

        if(strLength != str2Length) {
            System.out.print("Differing String lengths");
        }
        else {
            for (int i = 0 ; i != 14; i++) {
                char charI = str1.charAt(i);
                char charJ = str2.charAt(i);
                if (charI != charJ) {
                    retVal++;
                }
            }
        }
        return retVal;
    }

    /**
     * Main Method instantiates Object reference of class
     * to be operated on. Initializes the two strings and
     * passes them into compareString method. Prints out result.
     */

    public static void main(String[] args) throws Exception {

        StringCheck numReturn = new StringCheck();
        String str1 = new String("G679B89FGE345Y");
        String str2 = new String("GHQ9B89AU8345H");

        try {
            int numErrors = numReturn.compareString(str1, str2);
            System.out.print("" + numErrors);
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}


