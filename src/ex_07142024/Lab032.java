package ex_07142024;

public class Lab032 {
    public static void main(String[] args) {
        long phone = 7506754456l;
        //int phn = phone; //implicit narrowing
         int phn = (int) phone;
        System.out.println(phn);
    }
}
