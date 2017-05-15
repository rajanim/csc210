package ch11;

/**
 * Created by rajanishivarajmaski1 on 4/18/17.
 */
public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones" , 1);
        course1.addStudent("Kim Smith", 22);
        course1.addStudent("Anne kennedy", 33);

        course2.addStudent("Peter Jones", 1);
        course2.addStudent("Steve Smith", 55);


        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());

        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
    }
}
