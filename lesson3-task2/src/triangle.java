public class triangle {
    int x1, y1, x2, y2, x3, y3;
    public triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        if ( (Math.pow( ( (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) ), 0.5)) + ( Math.pow( ( (x2-x3)*(x2-x3)+(y2-y3)*(y2-y3) ), 0.5) ) > ( Math.pow( ( (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1) ), 0.5) ) ) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        } else{
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }
    public void perimetr(){
        double a, b, c;
        a = Math.pow( ( (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) ), 0.5);
        b = Math.pow( ( (x2-x3)*(x2-x3)+(y2-y3)*(y2-y3) ), 0.5);
        c = Math.pow( ( (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1) ), 0.5);
        System.out.println(a+b+c);
    }
    public void square(){
        double a, b, c;
        a = Math.pow( ( (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) ), 0.5);
        b = Math.pow( ( (x2-x3)*(x2-x3)+(y2-y3)*(y2-y3) ), 0.5);
        c = Math.pow( ( (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1) ), 0.5);
        double p =(a+b+c)/2;
        double s = Math.pow ( (p*(p-a)*(p-b)*(p-c)), 0.5);
        System.out.println(s);
    }
}
