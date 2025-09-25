package JAVA;

public class Main2{
    public static void main(String[] args){
        // 🔔variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // 📕Primitive = simple value stored directly in memory (stack)
        // 📘Reference = memory address (stack) that points to the (heap)

        // 📕Primitive vs 📘Reference
        // -----------    ---------
        // int            string
        // double         array
        // char           object
        // boolean

        int age; // declaration
        age = 8; // assignment
        System.out.println(age);

        double salary;     // declaration
        salary = 75000.00; // assignment
        System.out.println(salary);

        char grade;  // declaration
        grade = 'A'; // assignment
        System.out.println(grade);

        boolean isStudent;
        isStudent = true;
        if (isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        String name = "Bro Code";
        System.out.println(name + " is a Legend");

        int arr[] = {0, 9, 8, 7};
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }

    }
}
