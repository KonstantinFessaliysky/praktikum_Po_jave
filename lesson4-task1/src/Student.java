public abstract class Student {
    String name;
    String surname;
    int course;
    int last_rate;
    public Student(String name, String surname, int course, int last_rate){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.last_rate = last_rate;
    }
    abstract void writeExam();
}
