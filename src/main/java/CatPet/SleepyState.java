/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;

/**
 * sleepy state of a cat,cat will meow in a sleepy way
 */
public class SleepyState implements CatState {

    /**
     * print a sleepy meow message
     */
    @Override
    public void meow(Cat cat) {
        System.out.println(cat.name + " let out a sleepy little meow");
    }

    /**
     * return the name of this state
     */
    @Override
    public String getName(){
        return "sleepy";
    }
}