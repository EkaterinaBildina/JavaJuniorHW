package Task02_AnimalReflection;

public class Cat extends Animal{

    private String catBreed;
    public Cat(String name, int age, String catBreed) {
        super(name, age);
        this.catBreed = catBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("Mrrrrrr!");
    }
}
