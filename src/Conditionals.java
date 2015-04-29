/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals
{

    public static void main(String args[])
    {

        //Testing isOdd
        System.out.println(isOdd(2));
        System.out.println(isOdd(1));
        System.out.println("");

        //Testing isMultipleOfThree
        System.out.println(isMultipleofThree(9));//true
        System.out.println(isMultipleofThree(2));//false
        System.out.println("");

        //Testing isOddIsMultipleofThree
        System.out.println(isOddAndIsMultipleOfThree2(9));//true
        System.out.println(isOddAndIsMultipleOfThree2(4)); //false
        System.out.println("");

        //Testing fizzMultipleOfThree
        System.out.println(fizzMultipleofThree(9));
        System.out.println(fizzMultipleofThree(4));
        System.out.println("");
        //Testing cigarParty
        System.out.println(cigarParty(30)); // it's not the weekend
        System.out.println(cigarParty(50)); //it's the weekend
        System.out.println("");
        //Testing caughtSpeeding
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));
        System.out.println("");
        //Testing alarmClock
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
        System.out.println("");
        //Testing greenLottoTicket
        System.out.println(greenLottoTicket(2, 2, 1));
        System.out.println(greenLottoTicket(1, 2, 3));
        System.out.println(greenLottoTicket(1, 1, 1));
        //Testing BlackJack
        System.out.println("");

        System.out.println(blackJack(19, 21));
        System.out.println(blackJack(21, 19));
        System.out.println(blackJack(19, 22));

        //Testing Repeat String
        repeatString("foo", 4);


    }
    //Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.

    public static Boolean isOdd(int n)
    {

        if(n % 2 != 0)
        {
            return true;
        }
        else return false;
    }

    //Write a method isMultipleOfThree that takes in an int n.
    // Returns true if n is a multiple of three, and false otherwise

    public static Boolean isMultipleofThree(int n)
    {
        if(n % 3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Write a method isOddAndIsMultipleOfThree2 - if you used isOdd and isMultipleofThree in your last solution,
    // don't use it this time.
    // If you did not, write this method building on your last methods
    public static boolean isOddAndIsMultipleOfThree2(int n)
    {
        return isOdd(n) && isMultipleofThree(n);
    }

    //Write a method fizzMultipleofThree that takes in an int n and prints "Fizz"
    // if n is a multiple of three, and prints n otherwise.

    public static String fizzMultipleofThree(int n)
    {
        if(isMultipleofThree(n))
        {
            return ("Fizz");
        }
        else
        {
            return ("Buzz");
        }
    }
    //Write a method that takes in a Person and returns true if the person is from London, and false otherwise


    public static boolean cigarParty(int numOfCigars)
    {

        if(numOfCigars >= 40 && numOfCigars <= 60)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //***
    public static int caughtSpeeding(int speed, boolean result)
    {

        if(speed < 61)
        {
            return (0);
        }

        else if(speed >= 61 && speed <= 80)
        {
            return (1);
        }
        else if(speed >= 81)
        {
            return (2);
        }
        return caughtSpeeding(speed, result);
    }

    public static String alarmClock(int numIndex, boolean dayOfWeek)
    {

        if(numIndex >= 1 && numIndex <= 5)
        {
            return (7 + ":00 am");
        }
        else if(numIndex == 0 || numIndex == 6)
        {
            return (10 + ":00 am");
        }
        return alarmClock(numIndex, dayOfWeek);
    }

    public static int greenLottoTicket(int a, int b, int c)
    {

        if(a == b && a != c || a == c && a != b || c == b && c != a)
        {
            return (10);
        }
        else if(a != b || a != c || b != c)
        {
            return 0;
        }
        else if(a == c && a == b && c == b)
        {
            return (20);
        }
        return greenLottoTicket(a, b, c);
    }

    public static int blackJack(int a, int b)
    {
        //case1 a and b are over 21

        if(a >= 22 && b >= 22)
        {
            return blackJack(a, b);
        }
        //a is over 21
        else if(a > 22 && b < 21)
        {
            return a;
        }
        // b is over 21
        else if(b > 22 && a < 21)
        {
            return b;
        }
        else if(b < 21 && a < 21)
        {
            return (1);
        }
        return 2;
    }

    //public static boolean evenlySpaced (int a, int b, int c){


    //

    public static void repeatString(String input, int times){

        for(int i = 1; i<=times; i++){
            System.out.println(input);
        }

    }


        
    }











