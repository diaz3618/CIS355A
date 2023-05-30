/**************************************************** 
Program Name: BMI_Calculator.java 
Programmer's Name: Daniel F Diaz Santiago
Program Description: This program get the user's name, age,
*                    height, and weight. It uses that data
*                    to calculate the user's BMI and 
*                    max heart rate.
***********************************************************/

package BMI_Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HealthProfile profile = new HealthProfile();
        int age, weight, feet, inches;
        String name = ""; // Initialized
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.print("................................\n");
            if(name.equalsIgnoreCase("X")){
                break;
            }
            
            System.out.print("Enter name or X to quit: ");
            name = scan.nextLine();
            profile.setName(name);
            
            System.out.print("Your age: ");
            age = scan.nextInt();
            profile.setAge(age);
            
            
            System.out.print("Your weight: ");
            weight = scan.nextInt();
            profile.setWeight(weight);
            
            
            System.out.print("Your height - feet: ");
            feet = scan.nextInt();
            
            
            System.out.print("Your height - inches: ");
            inches = scan.nextInt();
            profile.setHeight(feet, inches);


            // Health Profile
            
            System.out.println("\nHealth Profile for " + profile.getName());
            System.out.printf("BMI %.1f\n", profile.getBMI()); // printf to format decimal output
            System.out.println("BMI Category: " + profile.getCategory());
            System.out.println("Max heart rate: " + profile.getMaxHR());
            
            name = ""; // Reset
        }
    }
}