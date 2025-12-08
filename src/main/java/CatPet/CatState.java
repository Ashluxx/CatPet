package CatPet;

// the most important part of State Pattern
// interface that used to show stae of cat
public interface CatState{

    // Defines how the cat acts
    void meow(Cat cat);

    // Returns the unique name of this state
    String getName();

}