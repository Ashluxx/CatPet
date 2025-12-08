package CatPet;

// 持有所有builder设置的属性
// 持有state
public class Cat {
    // all attribute
    String name;
    String breed;
    String eyecolor;
    String haircolor;
    String gender;
    int age;

    CatState state;


    public Cat(String name, String breed, String eyecolor,
               String haircolor, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.eyecolor = eyecolor;
        this.haircolor = haircolor;
        this.gender = gender;
        this.age = age;

        this.state = null;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Eyecolor: " + eyecolor);
        System.out.println("Haircolor: " + haircolor);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }

    public void meow(){
        //if we have an existing state,let it decicde how to meow
        if(state != null){
            state.meow(this);
            return;
        }else{
            System.out.println(name + " meows without any special feeling");
        }
    }

    public CatState getState(){
        return state;
    }

    public void setState(CatState state){
        this.state = state;
    }

    // get users action and change cat's state

}