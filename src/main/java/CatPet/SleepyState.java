/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;

public class SleepyState implements CatState {

    @Override
    public void meow(Cat cat) {
        System.out.println(cat.name + " let out a sleepy little meow");
    }

    @Override
    public String getName(){
        return "sleepy";
    }
}