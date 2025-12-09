/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */

package CatPet;

// the most important part of State Pattern
// interface that used to show stae of cat
public interface CatState{

    // Defines how the cat acts
    void meow(Cat cat);

    // Returns the unique name of this state
    String getName();

}
// reference: https://www.baeldung.com/java-state-design-pattern
// reference: https://refactoring.guru/design-patterns/state
// https://www.geeksforgeeks.org/java/interfaces-in-java