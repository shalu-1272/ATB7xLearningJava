package ex_07142024;

import java.util.Locale;

public class Lab050 {
    public static void main(String[] args) {
        String password = "Shaloo@123"; //Non primitive data type - string, array, enums, classes
        String pass_u = password.toLowerCase();
        System.out.println(pass_u == password);  //references wise both are different
        System.out.println(pass_u.equals(password)); //context wise also different

        //now let's say we want to igmore the lower or uppercase
        System.out.println(pass_u.equalsIgnoreCase(password));


    }
}
