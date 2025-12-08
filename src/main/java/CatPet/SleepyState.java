package CatPet;

public class SleepyState implements CatState {

    @Override
    public void meow(Cat cat) {
        System.out.println(cat.name + " let out a sleepy little meow");
    }

    public String getName(){
        return "sleepy";
    }
}