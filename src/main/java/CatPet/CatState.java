/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */

package CatPet;

/**
 * state of a cat in the state pattern
 */
public interface CatState{

    /**
     * let cat meows according to the current state
     */
    void meow(Cat cat);

    /**
     * return the name of current state
     */
    String getName();

}
// reference: https://www.baeldung.com/java-state-design-pattern
// reference: https://refactoring.guru/design-patterns/state
// https://www.geeksforgeeks.org/java/interfaces-in-java