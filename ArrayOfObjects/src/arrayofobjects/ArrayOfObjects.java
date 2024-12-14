package arrayofobjects;

/**
 *
 * @author sys
 */
public class ArrayOfObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Shriteja";
        s1.marks = 98;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Shastry";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "XYZ";
        s3.marks = 70;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (Student stud : students) {
            System.out.println(stud);
            System.out.println("Student:" + stud.name + ", Marks:" + stud.marks);
        }

    }

}
