
package javaapplication1;

public class constructorOverlolading {
    public static void main(String[] args) {
        Box box1 = new Box(10,20,30);
        Box box2 = new Box();
        Box box3 = new Box(10);
        double vol;
        vol = box1.volume();
        System.out.println("Volume of box 1: "+vol);
        vol = box2.volume();
        System.out.println("Volume of box 2: "+vol);
        vol = box3.volume();
        System.out.println("Volume of box 3: "+vol);
    }
}
class Box{
    double width, height, depth;
    Box(double w,double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = height = depth = -1;
    }
    Box(double l){
        width = depth = height = l;
    }
    double volume(){
        return width*height*depth;
    }
}
