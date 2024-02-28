import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Напишите программу, которая использует Stream API для обработки списка чисел.
// Программа должна вывести на экран среднее значение всех четных чисел в списке.
public class Task01 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNum = input.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("Четные: " + evenNum);

        double average = evenNum.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Среднее значение: " + average);

    }


}
