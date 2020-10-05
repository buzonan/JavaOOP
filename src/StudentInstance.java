public class StudentInstance {
    public static void main(String[] args) {
        Student student = new Student(
                "John Doe",
                25,
                'M',
                "2015-100132"
        );

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("ID NO.: " + student.getIdNum());
    }
}
