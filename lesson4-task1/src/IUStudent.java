public class IUStudent extends Student{
    public IUStudent(String name, String surname, int course, int last_rate) {
        super(name, surname, course, last_rate);
    }

    @Override
    void writeExam() {
        System.out.println("Студент-программист " + course + "-го курса " + this.name + " " + this.surname + " сдал экзамен на " + this.last_rate);
    }
}