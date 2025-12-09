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
