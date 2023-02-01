package lesson1;

public class StringType {
    public static void main(String[] args) {

        //We can take in string as argument when we run our program
        String argumentOne = args[0];
        System.out.println(argumentOne);

        //how to concatenate (putting together two strings?)
        String string1 = "Michael";
        String string2 = "Jacobs";
        String space = " ";
        //how to printout Michael Jacobs?
        System.out.println(string1 + string2);
        System.out.println(string1+space+string2);
    }

}
