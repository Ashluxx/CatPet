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

    //prepare for state pattern
    String status;


    public Cat(String name, String breed, String eyecolor,
               String haircolor, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.eyecolor = eyecolor;
        this.haircolor = haircolor;
        this.gender = gender;
        this.age = age;

        this.status = "normal";
    }

    public void meow(){
        System.out.println(name + " meows");
        System.out.println(name + " feels " + status + " right now.");
    }

    //prepare for state pattern
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

}