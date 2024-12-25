//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new MathStudent("Валерий", "Шпагин", 1, 5);
        s1.writeExam();
        Student s2 = new IUStudent("Анатолий", "Скворцов", 2, 3);
        s2.writeExam();
    }
}