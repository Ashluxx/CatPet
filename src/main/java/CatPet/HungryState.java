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
