package java_mosh2;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean equals(Point o) {
        if (this == o)
            return true;
        
        if(!(o instanceof Point))
            return false;
        
        Point other = (Point) o;
        return (other.x == x && other.y == y);
    }

    @Override
    public int hashCode() {
    return Objects.hash(x, y);
    }
    
}
