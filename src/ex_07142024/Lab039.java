package ex_07142024;

public class Lab039 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // ++a = 11 value of a = 11
        // a++ = 11, value of a =12
        //a++ = 12, value of a = 13
        System.out.println(a);
    }
}
