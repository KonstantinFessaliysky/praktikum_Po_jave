public class rectangle {
    double length;
    double width;
    public rectangle(double length, double width){
        if (length>0.0 && width>0.0) {
            this.length = length;
            this.width = width;
        } else{
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }
    void square(){
        System.out.println(length*width);
    }
    void perimetr(){
        System.out.println((length+width)*2);
    }
}

