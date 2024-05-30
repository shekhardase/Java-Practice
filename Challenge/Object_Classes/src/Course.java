public class Course {

    String CourseName;

    static int maxCapacity = 0;

    int enrollment;

    String[] enrolledStudents = new String[maxCapacity];

    static void SetMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollmentStudent(String studentName) {
        enrolledStudents[enrollment] = studentName;
        enrollment++;
    }

    void unenrollStudent(String studentName) {
        enrollment--;
    }


    Course(String CourseName) {
        this.CourseName = CourseName;
        this.enrollment = 0;
        this.enrolledStudents = new String[maxCapacity];
    }


}
