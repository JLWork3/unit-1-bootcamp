import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {

      int x = 113;
      double y = 2.71828;
      String c = "Computer Science";


      System.out.println("This is room # " + x );
      System.out.println("e is close to " + y);
      System.out.println("I'm learning a bit about " + c);
      System.out.println( isOdd(2));
      System.out.println( isOdd(7));
      printHelloWorld("Jann");



  }

    public static boolean isOdd (int x) {

        if (x % 2 ==1) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void printHelloWorld (String word) {
        System.out.println(word);

    }
}
