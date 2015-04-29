/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects
{

    public static void main(String args[])
    {


        Person person1 = new Person();
        person1.setName("John");
        person1.setCity("Tokyo");
        person1.setPhoneNumber("7181001234");


        Person person2 = new Person();
        person2.setName("Jan");
        person2.setCity("New York");
        person2.setPhoneNumber("9170003300");



        String city = person2.getCity();
        String cityToCheck = "London";// can change
        if(cityToCheck.toLowerCase().equals(city.toLowerCase()))// checking if true
        {
            System.out.println(person2.getName() + " is from " + cityToCheck);
        }
        else
        {
            System.out.println(person2.getName() + " is not from " + cityToCheck);
        }


    }

}
