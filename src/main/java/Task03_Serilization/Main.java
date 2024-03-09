package Task03_Serilization;


public class Main {
    public static void main(String[] args) {
        Student[] studentsList = new Student[4];
        studentsList[0] = new Student("Ekaterina", 35, 9.8 );
        studentsList[1] = new Student("Alexander", 37, 8.4 );
        studentsList[2] = new Student("Semen", 38, 6.4 );
        studentsList[3] = new Student("Fekla", 68, 10.0 );


        for(Student student: studentsList){
            student.serializeTask(student, "studentsSer.txt");
            System.out.println("---successfully---");
        }

        for(Student student: studentsList){
            student.deserializeTask("studentsSer.txt");
            System.out.println("Student ->  " + "Name: " + student.name + " Age: " + student.age + " GPA: " + student.GPA);
        }
    }


}
