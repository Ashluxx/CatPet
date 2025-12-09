/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;

/**
 * A cat in the pet system
 * It stores all attributes from the builder and holds the current CatState
 */
public class Cat {

    String name;
    String breed;
    String eyecolor;
    String haircolor;
    String gender;
    int age;

    CatState state;

    /**
     * Create a cat with basic information.
     */
    public Cat(String name, String breed, String eyecolor,
               String haircolor, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.eyecolor = eyecolor;
        this.haircolor = haircolor;
        this.gender = gender;
        this.age = age;

        // the inital state is satisfied
        this.state = new SatisfiedState();
    }

    /**
     * Print all basic information of this cat to the console
     */
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Eyecolor: " + eyecolor);
        System.out.println("Haircolor: " + haircolor);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }

    /**
     * Let the cat meow based on its current state
     */
    public void meow(){
        state.meow(this);
    }

    /**
     * Return the current state of cat
     */
    public CatState getState(){
        return state;
    }

    /**
     * set a new state for cat
     */
    public void setState(CatState state){
        this.state = state;
    }

    /**
     * change state to hungry/sleepy randomly
     * after that calls meow() to show the new state
     */
    public void triggerRandomState(){
        double random = Math.random();

        if(random < 0.5){
            setState(new HungryState());
            // use meow method to inform user the state has changed
            System.out.println("==================================");
            meow();
            System.out.println("==================================");
        }else{
            setState(new SleepyState());
            System.out.println("==================================");
            meow();
            System.out.println("==================================");
        }
    }

    /**
     * change state according to users input
     */
    public void handleAction(String action){
       //get current state
        String current = state.getName();

        if("hungry".equals(current)) {
            if (action.equals("feed")) {
                setState(new SatisfiedState());
                System.out.println("==================================");
                meow();
                System.out.println("==================================");
            } else {
                System.out.println(name + " is too hungry to do anything else.");
            }
        }else if("sleepy".equals(current)){
            if(action.equals("play")){
                setState(new SatisfiedState());
                System.out.println("==================================");
                meow();
                System.out.println("==================================");
            }else{
                System.out.println(name + " is too sleepy to do anything else.");
            }
        }else{
                System.out.println(name + " don't need anything.");
            }
    }
}
// reference: https://www.w3schools.com/java/ref_string_equals.asp
// reference: https://www.w3schools.com/java/java_howto_random_number.asp
// https://www.geeksforgeeks.org/java/generating-random-numbers-in-java/
// https://stackoverflow.com/questions/6319727/what-exactly-does-double-mean-in-java