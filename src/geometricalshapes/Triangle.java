
package geometricalshapes;

public class Triangle {
    /*
    public double area(){
    double p = (sideA + sideB + sideC )/ 2;
    double toSquare = p * (p - sideA) * (p - sideB) * (p - sideC);
    double area = Math.sqrt(toSquare);
       
    return area;
}*/
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    
    public Triangle(double base,double height, double sideA, double sideB){
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    
    public double area(){
        double area = base * height / 2;
        return area;
    }
    
    public double circumference(){
        return base + sideA + sideB;
    }
    
}
