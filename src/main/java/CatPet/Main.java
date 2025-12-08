package CatPet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new CatBuilder()
                .age(3)
                .breed("Ragdoll")
                .eyecolor("Blue")
                .gender("Male")
                .haircolor("White")
                .name("Coco")
                .createCat();

        myCat.showInfo();
        myCat.meow();

        myCat.triggerRandomState();

        Scanner input = new Scanner(System.in);

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
