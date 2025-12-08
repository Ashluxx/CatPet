package CatPet;

//Builder pattern is used to solve the long list of inputs (parameters) in the Cat constructor.
public class CatBuilder {

    String name;
    String breed;
    String eyecolor;
    String haircolor;
    String gender;
    int age;

    public CatBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CatBuilder breed(String breed) {
        this.breed = breed;
        return this;
    }

    public CatBuilder eyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
        return this;
    }

    public CatBuilder haircolor(String haircolor) {
        this.haircolor = haircolor;
        return this;
    }

    public CatBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public CatBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Cat createCat() {
        return new Cat(name, breed, eyecolor, haircolor, gender, age);
    }
}
