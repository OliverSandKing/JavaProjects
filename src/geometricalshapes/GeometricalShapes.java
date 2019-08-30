
package geometricalshapes;

import java.util.Scanner;


public class GeometricalShapes {
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose between following options:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("0. Quit");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                
                System.out.println("Input radius of the circle:");
                double radiusInput = sc.nextInt();
                Circle c1 = new Circle(radiusInput);
                System.out.println("Choose between:");
                System.out.println("1. Calculate area");
                System.out.println("2. Calculate circumference");
                System.out.println("3. Calculate area and circumference");
                System.out.println("0. Quit");
                int choice2 = sc.nextInt();
                
                if(choice2 == 1){
                    System.out.println("The area of the circle is " + c1.area());
                }else if(choice2 == 2){
                    System.out.println("The circumference of the circle is " + c1.circumference());
                }else if    
        }
        
        //Circle c1 = new Circle(radiusInput);
        //System.out.println("The area of the circle c1 is " + c1.area() + " and the circumference is " + c1.circumference());
        
        Rectangle r1 = new Rectangle(10, 5);
        System.out.println("The area of the rectangle r1 is " + r1.area() + " and the circumference is " + r1.circumference());
        
        Triangle t1 = new Triangle(10, 8, 7, 9);
        System.out.println("The area of the triangle t1 is " + t1.area() + " and the circumference is " + t1.circumference());
        
        
        
        
        
        
    }
    
}
