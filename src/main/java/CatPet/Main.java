/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;
import java.util.Scanner;

/**
 * entry of the catpet application
 * user can create a cat and interact with it by using console
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your cat's name: ");
        String catName = input.nextLine();
        System.out.println("Enter your cat's breed: ");
        String catBreed = input.nextLine();
        System.out.println("Enter your cat's eyecolor: ");
        String catEyecolor = input.nextLine();
        System.out.println("Enter your cat's gender: ");
        String catGender = input.nextLine();
        System.out.println("Enter your cat's haircolor: ");
        String catHaircolor = input.nextLine();

        // need to add a data validation for age attribute
        int catAge;
        while(true){
            System.out.println("Enter your cat's age: ");
            String catAgeString = input.nextLine();
            try {
                catAge = Integer.parseInt(catAgeString);
                break;
            }catch (NumberFormatException e){
                System.out.println("Invalid age");
            }
        }

        Cat myCat = new CatBuilder()
                .age(catAge)
                .breed(catBreed)
                .eyecolor(catEyecolor)
                .gender(catGender)
                .haircolor(catHaircolor)
                .name(catName)
                .createCat();

        myCat.showInfo();

        // outer loop,  make sure cat will refresh state continuously
        boolean running = true;
        while (running) {

            // pausing shortly to enhance the user experience
            try {
                System.out.println("--- Waiting for a new mood ---");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // set a new state randomly
            myCat.triggerRandomState();

            //inner loop, if user's action is wrong, allow user to try again
            while(true){
                System.out.print("Enter Your Action(feed/play/exit): ");
                String action = input.nextLine();

                if ("exit".equalsIgnoreCase(action)) {
                    System.out.println("Goodbye.");
                    running = false; // stop the outer loop
                    break;
                }
                // record the state before and after the action
                String before = myCat.getState().getName();

                myCat.handleAction(action);

                String after = myCat.getState().getName();

                if (!"satisfied".equals(before) && "satisfied".equals(after)) {
                    break;
                }
            }
        }
    }
}
// reference:https://medium.com/@AlexanderObregon/how-to-pause-a-java-program-for-a-few-seconds-safely-and-correctly-7b49c71576f9
// https://stackoverflow.com/questions/886955/how-do-i-break-out-of-nested-loops-in-java
// https://www.geeksforgeeks.org/java/java-nested-loops-with-examples/
// https://www.w3schools.com/java/java_user_input.asp
// https://stackoverflow.com/questions/2942686/taking-integer-input-in-java