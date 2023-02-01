package lesson1;
import java.lang.Object;
public class NumericTypes { //we use upper case camel for Class names
    //Double is 64 bits   -> the largest number that can be represented
    //int is 32 bits
    //char is 8 bits
    public static void main(String[] args) {

        Double numb1 = 2.25; //we use lowercase for variables
        int numb2 = 2;
        Object obj2 = numb2;
        String class1 = numb1.getClass().getSimpleName();

        String class2 = obj2.getClass().getSimpleName();

        System.out.println(class1 + " " + numb1);
        System.out.println(class2 + " " + numb2);
        //What do you think will be the type of numb1 + numb2?
        obj2 = numb2 + numb1;
        String class3 = obj2.getClass().getSimpleName();
        System.out.println(class3 + " " + (numb2 + numb1));




    }
}
