import java.util.*;
import java.util.Calendar;

public class Testassert {

    String name;
    String id;

    public Testassert(String name){
        this.name = name;
        System.out.println("welcome "+ this.name);
        System.out.println("this programme doesn't allow under age people!!!!");
    }

    public static String testString (String id){
       String sub =  id.substring(0, 2);
       char[] cha0 = sub.toCharArray();

       if(cha0[0] == '9'){
           String one_9 = "19" + sub;
           return one_9;

       }else if(cha0[0] == '0' || cha0[1] == '1' || cha0[1] == '2' || cha0[1] == '3'
       || cha0[1] == '4' || cha0[1] == '5' || cha0[1] == '6' || cha0[1] == '7'
       || cha0[1] == '8' || cha0[1] == '9'){
           String one_2 = "20" + sub;
           return one_2;
       }else{
           System.out.println("invalid input");
       }
        return "";
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name");
        String x = scan.nextLine();
        Testassert ass = new Testassert(x);
        System.out.println("please enter your ID number");
        String age = scan.nextLine();

        if (age.length() == 13) {
            int changeit = Integer.parseInt(testString(age));
            System.out.println(changeit);
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int your_age =  year - changeit;
            System.out.println(your_age);

            assert your_age >= 18 : "you are under age";
            System.out.println("you have grown up");

        }else{
            System.out.println("your ID is invalid!");
        }

        }
}
