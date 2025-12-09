/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */
package CatPet;

public class SatisfiedState implements CatState{

    @Override
    public void meow(Cat cat) {
        System.out.println(cat.name + " is satisfied now :3");
    }

    @Override
    public String getName(){
        return "satisfied";
    }

}
