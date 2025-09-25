package JAVA;

public class Main10{
    public static void main(String[] args){

        // printf() = is a method used to format output

        // %[flags][width][.precision][specific-character]
 

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n",firstLetter);
        System.out.printf("Your are %d years old\n", age);
        System.out.printf("Your height is %f\n", height);
        System.out.printf("Your are Employed: %b\n\n", isEmployed);

        System.out.printf("%s is %d years old\n\n", name, age);

        // [flags] :
        //         +     => output a plus
        //         ,     => comma seperator
        //         (     => negative numbers are enclosed in ()
        //         space => display a minus if negative, space if positive

        double price1 = 342325.4555, price2 = 89432.432354, price3 = -232434.4324, price4 = 217.24;

        System.out.printf("%+,(.1f\n", price1);
        System.out.printf("%+,(.3f\n", price2);
        System.out.printf("%+,(.2f\n", price3);
        System.out.printf("% .2f\n\n", price4);

        // [width] : 
        //         0               => zero padding
        //         number          => right justified padding
        //         negative number => left justified padding

        int id1 = 1; int id2 = 23; int id3 = 456; int id4 = 7890;
        
        System.out.printf(("%03d\n"), id1);
        System.out.printf(("%4d\n"), id2);
        System.out.printf(("%-4d\n"), id3);
        System.out.printf(("%02d\n"), id4);
    }
}