package JAVA;

import java.util.Scanner;

public class Main45{
    public static void main(String[] args){

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Scanner scanner = new Scanner(System.in);

        Person person = new Person("Tom", "Riddle");
        person.showName();

        Student student = new Student("Harry", "Potter", 5);
        student.showName();
        student.showGPA();

        Employee employee = new Employee("Ron", "Weasly", 45000);
        employee.showName();
        employee.showSalary();

        scanner.close();
    }
}