public class Main {
    public static void main(String[] args) {
        circle f1 = new circle(5.0);
        rectangle f2 = new rectangle(6.0, 3.0);
        triangle f3 = new triangle(0, 0, 0, 3, 4, 0);
        //triangle f4 = new triangle(-1, -1, 0, 0, 1, 1);
        f1.perimetr();
        f1.square();
        f2.perimetr();
        f2.square();
        f3.perimetr();
        f3.square();
    }
}