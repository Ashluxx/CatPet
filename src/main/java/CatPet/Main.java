package CatPet;
import java.util.Scanner;

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

        myCat.triggerRandomState();

        while (true) {
            System.out.print("Enter Your Action(feed/play/exit): ");
            String action = input.nextLine();

            if ("exit".equals(action)) {
                System.out.println("Goodbye.");
                break;
            }

            myCat.handleAction(action);

        }
    }
}
