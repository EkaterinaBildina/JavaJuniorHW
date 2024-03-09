package Task03_Serilization;

import java.io.*;

//Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
//Обеспечьте поддержку сериализации для этого класса.
//Создайте объект класса Student и инициализируйте его данными.
//Сериализуйте этот объект в файл.
//Десериализуйте объект обратно в программу из файла.
// Выведите все поля объекта, включая GPA, и обсудите,
 // почему значение GPA не было сохранено/восстановлено.
public class Student implements Serializable {

    public String name;
    public int age;
    public transient double GPA;

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s",
                name,
               age, GPA +
                '\n');
    }

    public void serializeTask(Student student, String fileName){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Student " + student + " data was write to the file with name -> " + fileName +  " <- successful");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Student deserializeTask(String fileName) {
        Student student = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Deserialized data from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student;
    }
}
