package com.tnsif.constructor;

/**
 * @author sys
 */
import java.util.Scanner;

public class PersonDemo {

    public static void main(String[] args) {

        //Initiaizing the object through default constructor
        Person personOne = new Person();
        personOne.setName("Shriteja");
        personOne.setAge(21);
        personOne.setGender("male");
        personOne.setSalary(34500.44f);
        System.out.println(personOne);

        //Initiaizing the object through parameterized constructor
        Person personTwo = new Person("Shriteja", 21, "male", 34500.44f);
        System.out.println(personTwo);
        
        //Initiaizing the object through user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String name = sc.nextLine();
        System.out.println("Enter the name of the person:");
        int age = sc.nextInt();
        System.out.println("Enter the name of the person:");
        String gender = sc.nextLine();
        System.out.println("Enter the name of the person:");
        float salary = sc.nextFloat();
        
        Person personThree = new Person(name, age, gender, salary);
        System.out.println(personThree);
        
        



    }

}
