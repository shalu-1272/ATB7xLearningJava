package ex_07142024;

public class Lab031 {
    public static void main(String[] args) {
  //implicit casting
        byte a = 10;
        int b = (int)a; //int is greyed out
        // because we are trying to put smaller basket into larger
        //JVM can process it on it's own and we don't need to mention it
        System.out.println(b);

        //Explicit casting
        int a1 = 300;
       // byte b1 = a1;  we are trying to put large number into small memory so we need to shrink

        byte b1 = (byte)a1;
        System.out.println(b1);
    }
}
