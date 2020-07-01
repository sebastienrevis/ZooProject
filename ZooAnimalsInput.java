package be.vdab.ZooProject;

import java.io.*;
import java.lang.*;
import java.util.*;

public class ZooAnimalsInput {
    public static void main(String[] args) {
        String type;
        String name;
        double weight;
        String sex;
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the animal type: ");
        type = scan.nextLine();
        System.out.print("Please enter the animal's name: ");
        name = scan.nextLine();
        System.out.print("Please enter the animal's weight: ");
        weight = scan.nextDouble();
        System.out.print("Please enter the animal's sex: ");
        sex = scan.next();
        System.out.print("Please enter the animal's age: ");
        age = scan.nextInt();
        scan.close();

        switch (type) {
            case "giraffe":
                Giraffe giraffe = new Giraffe(name, weight, sex, age);
                System.out.println(giraffe);
                break;
            case "zebra":
                Zebra zebra = new Zebra(name, weight, sex, age);
                System.out.println(zebra);
                break;
            case "tiger":
                Tiger tiger = new Tiger(name, weight, sex, age);
                System.out.println(tiger);
                break;
            case "crocodile":
                Crocodile crocodile = new Crocodile(name, weight, sex, age);
                System.out.println(crocodile);
                break;
            case "elephant":
                Elephant elephant = new Elephant(name, weight, sex, age);
                System.out.println(elephant);
                break;
        }
    }
}

