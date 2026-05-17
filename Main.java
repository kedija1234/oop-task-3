package kedijaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        
        ArrayList<Programmer> programmers = new ArrayList<>();

        try {
            
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter your age: ");
            int age = input.nextInt();

            input.nextLine();

            System.out.print("Enter favorite language: ");
            String language = input.nextLine();

            
            Person p = new Programmer(name, age, language);

            
            programmers.add((Programmer)p);

            System.out.println("\nSaved Successfully!");

            
            p.activity();

        
            for(Programmer pr : programmers) {

                pr.showInfo();
            }

        } 
        catch(Exception e) {

            
            System.out.println("Invalid input!");
        }

        input.close();
    }
}