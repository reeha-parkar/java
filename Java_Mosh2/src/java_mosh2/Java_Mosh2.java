package java_mosh2;

public class Java_Mosh2 {

    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);
        //System.out.println(point1 == point2); //returns false because obj is reference type and they are diff
        //System.out.println(point1.equals(point1)); // again false, because same reason
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        
    }
    
    
}
