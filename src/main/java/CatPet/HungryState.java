/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;

/**
 * hungry state of a cat,cat will meow in a hungry way
 */
public class HungryState implements CatState {

    /**
     * print a hungry meow message
     */
    @Override
    public void meow(Cat cat) {
        System.out.println(cat.name + " let out a hungry little meow");
    }

    /**
     * return the name of this state
     */
    @Override
    public String getName(){
        return "hungry";
    }
}
