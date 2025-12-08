package CatPet;

public class Main {
    public static void main(String[] args) {

        /*Cat myCat = new Cat("Coco","Ragdoll",
                "Blue", "White", "Male", 3);*/

        Cat myCat = new CatBuilder()
                .age(3)
                .breed("Ragdoll")
                .eyecolor("Blue")
                .gender("Male")
                .haircolor("White")
                .name("Coco")
                .createCat();

        myCat.meow();
    }
}
