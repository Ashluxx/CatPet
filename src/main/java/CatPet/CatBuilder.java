/**
 * 2025-12-08
 * Yuke Cao
 * CS665 A1 Fall2025
 * Final Project
 */

package CatPet;

/**
 * builder to create cat object
 * avoid long constructer with many parameters
 */
public class CatBuilder {

    String name;
    String breed;
    String eyecolor;
    String haircolor;
    String gender;
    int age;

    /**
     * set the cat;s name
     * return this builder
     */
    public CatBuilder name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set the cat's breed
     * return this builder
     */
    public CatBuilder breed(String breed) {
        this.breed = breed;
        return this;
    }

    /**
     * set the cat's eye color
     * return this builder
     */
    public CatBuilder eyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
        return this;
    }

    /**
     * set the cat's hair color
     * return this builder
     */
    public CatBuilder haircolor(String haircolor) {
        this.haircolor = haircolor;
        return this;
    }

    /**
     * set the cat's gender
     * return this builder
     */
    public CatBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * set the cat's age
     * return this builder
     */
    public CatBuilder age(int age) {
        this.age = age;
        return this;
    }

    /**
     * build a cat and return it using the value in builder
     */
    public Cat createCat() {
        return new Cat(name, breed, eyecolor, haircolor, gender, age);
    }
}
// reference: https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java
// reference: https://www.baeldung.com/java-builder-pattern