

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops
{

    public static void main(String args[])
    {

        printNum();

        System.out.println("");//Break

        //Testing printNum2
        printNum2();

        System.out.println("");

        //Testing printN
        printsN(10);

        System.out.println("");

        //Testing printEvenNumbers

        printEvenNumbers(10);

        //Testing sumofNum

        System.out.println("");
        sumOneToTen();


    }

    //Write a method that prints the numbers 1 through 10 using a loop. (1)
    public static void printNum()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }

    //Write a method that prints the numbers 1 through 10 using a different kind of loop. (2)
    public static void printNum2()
    {
        int i = 1;
        while(i < 10)
        {
            System.out.println(i);
            i++;
        }
    }

    //Write a method that takes in an int n and prints the numbers 1 through n. (3)
    public static void printsN(int n)
    {
        int i = 0;
        while(i <= n)
        {
            System.out.println(i);
            i++;
        }

    }

    //Write a method that takes in an int n and prints the even numbers 2 through n. (4)
    public static void printEvenNumbers(int n)
    {

        for(int i = 2; i <= n; i++)
        {
            System.out.println(i);
            i++;
        }

    }

    //Write a method that prints the sum of 1 through 10 using a loop.

    public static void sumOneToTen()
    {
        int sum = 0;

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
            sum +=i;

        }
            System.out.println("sum of all numbers 1 to 10: " + sum );



    }
}
