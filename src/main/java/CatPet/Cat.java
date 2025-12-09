/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;

// 持有所有builder设置的属性
// 持有state
public class Cat {
    // all attribute
    String name;
    String breed;
    String eyecolor;
    String haircolor;
    String gender;
    int age;

    CatState state;


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

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Eyecolor: " + eyecolor);
        System.out.println("Haircolor: " + haircolor);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }

    public void meow(){
        //if we have an existing state,let it decicde how to meow
        if(state != null){
            state.meow(this);
        }else{
            System.out.println(name + " meows without any special feeling");
        }
    }

    public CatState getState(){
        return state;
    }

    public void setState(CatState state){
        this.state = state;
    }

    // change state to hungry/sleepy randomly
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

    // change state according to users input
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