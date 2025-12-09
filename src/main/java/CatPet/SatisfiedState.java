/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;

/**
 * satisfied state of a cat
 */
public class SatisfiedState implements CatState{

    /**
     * print a message to show the cat state
     */
    @Override
    public void meow(Cat cat) {
        System.out.println(cat.name + " is satisfied now :3");
    }

    /**
     * return the name of this state
     */
    @Override
    public String getName(){
        return "satisfied";
    }

}
