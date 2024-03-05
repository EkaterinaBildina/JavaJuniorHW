package Task02_AnimalReflection;

public class Dog extends Animal{

    private String dogBreed;
    public Dog(String name, int age, String dogBreed) {
        super(name, age);
        this.dogBreed = dogBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
