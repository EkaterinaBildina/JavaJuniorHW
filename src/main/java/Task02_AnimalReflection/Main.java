package Task02_AnimalReflection;

// Создайте абстрактный класс Animal с полями name и age.
// Реализуйте два класса-наследника от Animal (например Dog и Cat),
// с униальными полями и методами.
// Создайте массив объекта типа Animal с использованием Reflection API
// выполните следующие действия:
// Выведите на экран информацию о каждом объекте.
// Вызовите метод makeSound() у каждого объекта, если такой метод присутствует.

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Animal[] animalS = new Animal[3];
        animalS[0] = new Dog("Sharik", 2, "Dvornyazhka");
        animalS[1] = new Cat("Matroskin", 4, "Domashniy");
        animalS[2] = new Cat("Barsik", 1, "Pers");

        for(Animal animal: animalS){
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);

            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } ;
            System.out.println("----------------------------");
        }
    }
}
