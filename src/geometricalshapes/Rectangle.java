
package geometricalshapes;


public class Rectangle {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        double area = length * width;
        return area;
    }
    public double circumference(){
        return (length * 2)+(width * 2);
    }
    
}
