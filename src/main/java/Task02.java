import java.lang.reflect.Method;

public class Task02 {

    //Используя Reflection API, напишите программу,
    // которая выводит на экран все методы класса String.

    public static void main(String[] args) {
        Class stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }


}
