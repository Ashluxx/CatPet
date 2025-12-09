/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;

public class HungryState implements CatState {

    @Override
    public void meow(Cat cat) {
        System.out.println(cat.name + " let out a hungry little meow");
    }

    @Override
    public String getName(){
        return "hungry";
    }
}
