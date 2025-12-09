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