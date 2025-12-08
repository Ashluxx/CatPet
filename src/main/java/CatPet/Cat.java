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

    public Cat(String name, String breed, String eyecolor,
               String haircolor, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.eyecolor = eyecolor;
        this.haircolor = haircolor;
        this.gender = gender;
        this.age = age;
    }

    public void meow(){
        System.out.println(name + " meows");
    }


}