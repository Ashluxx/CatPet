package CatPet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    // defalut state of a cat should be satisfied
    @Test
    public void testNewCatDefaultStateIsSatisfied(){
        Cat cat = new Cat("Coco", "Ragdoll", "Blue", "White", "Male", 3);

        assertNotNull(cat.getState());
        assertEquals("satisfied", cat.getState().getName());
    }

    // builder should create a cat with the given value
    @Test
    public void testBuilderCreatesCatWithCorrectAttributes() {
        CatBuilder builder = new CatBuilder()
                .name("Lele")
                .breed("Ragdoll")
                .eyecolor("Black")
                .haircolor("Black")
                .gender("Male")
                .age(10);

        Cat cat = builder.createCat();

        assertEquals("Lele", cat.name);
        assertEquals("Ragdoll", cat.breed);
        assertEquals("Black", cat.eyecolor);
        assertEquals("Black", cat.haircolor);
        assertEquals("Male", cat.gender);
        assertEquals(10, cat.age);
    }

    // When the cat is hungry and user feeds it, state should become satisfied
    @Test
    public void testHungryFeedBecomesSatisfied() {
        Cat cat = new Cat("Coco", "Ragdoll", "Blue", "White", "Male", 3);

        // put the cat into hungry state
        cat.setState(new HungryState());
        assertEquals("hungry", cat.getState().getName());

        cat.handleAction("feed");

        // after feeding, the cat should be satisfied
        assertEquals("satisfied", cat.getState().getName());
    }

    // When the cat is sleepy and user plays with it, state should become satisfied
    @Test
    public void testSleepyPlayBecomesSatisfied() {
        Cat cat = new Cat("Coco", "Ragdoll", "Blue", "White", "Male", 3);

        // put the cat into sleepy state
        cat.setState(new SleepyState());
        assertEquals("sleepy", cat.getState().getName());

        cat.handleAction("play");

        // after playing, the cat should be satisfied
        assertEquals("satisfied", cat.getState().getName());
    }

    // Wrong action should not change state to satisfied
    @Test
    public void testWrongActionDoesNotChangeHungryState() {
        Cat cat = new Cat("Coco", "Ragdoll", "Blue", "White", "Male", 3);

        // put the cat into hungry state
        cat.setState(new HungryState());
        assertEquals("hungry", cat.getState().getName());

        // wrong action: play instead of feed
        cat.handleAction("play");

        // state should still be hungry
        assertEquals("hungry", cat.getState().getName());
    }

}
