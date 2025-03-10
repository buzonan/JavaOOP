public class Student {
    private String name;
    private int age;
    private char gender;
    private String idNum;

    public Student(String name, int age, char gender, String idNum) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

}
