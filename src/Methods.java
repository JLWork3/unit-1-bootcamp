/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {

      System.out.println(calculateSquare(2));
      System.out.println(calculateSquare(3));
      System.out.println(calculateSquare(4));


      //Calculate SquareRoot
      calculateSquareRoot(4);
      calculateSquareRoot(9);
      calculateSquareRoot(16);
      //System.out.println(toLowerCase("Hello,world!"));




  }
    public static int calculateSquare(int x){
        return x * x;
    }

    public static double calculateSquareRoot(double y) {
        return Math.sqrt(y);
    }



    }



}

