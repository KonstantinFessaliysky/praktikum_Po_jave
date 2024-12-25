public class circle {
    double rad;
    public circle(double rad){
        if (rad>0.0) {
            this.rad = rad;
        } else {
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }
    void square(){
        System.out.println(rad*rad*3.14159);
    }
    void perimetr(){
        System.out.println(rad*2*3.14159);
    }
}
