package ch11;

public class StudentTest {
    public static void main(String[] args) {

        MyLogger logger = MyLogger.getLogger();

        String name = null;
        try {
            Student student = new Student(name);
        }catch (StudentNameFormatException e){
            logger.warning(e.getMessage());
        }

        try {
            Student student = new Student("ABC EF G K");
        }catch (StudentNameFormatException e){
            logger.warning(e.getMessage());
        }

        Student student = new Student("James");
        student.getStudentName();
    }

}
