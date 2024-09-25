import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------");
        System.out.println("Clonando Retângulo");
        System.out.println("--------------------------------");

        Rectangle rect1 = new Rectangle();
        rect1.x = 35;
        rect1.y = 45;
        rect1.width = 20;
        rect1.height = 30;
        rect1.color = "Blue";

        Rectangle rectClone = (Rectangle) rect1.clone();
        System.out.println("Original: " + rect1);
        System.out.println("Clone: " + rectClone);

        System.out.println("\n--------------------------------");
        System.out.println("Clonando Círculo");
        System.out.println("--------------------------------");

        Circle circle1 = new Circle();
        circle1.x = 12;
        circle1.y = 18;
        circle1.radius = 14;
        circle1.color = "Red";

        Circle circleClone = (Circle) circle1.clone();
        System.out.println("Original: " + circle1);
        System.out.println("Clone: " + circleClone);

        System.out.println("\n--------------------------------");
        System.out.println("Clonando Triângulo");
        System.out.println("--------------------------------");

        Triangle triangle1 = new Triangle();
        triangle1.x = 10;
        triangle1.y = 5;
        triangle1.base = 9;
        triangle1.height = 14;
        triangle1.color = "Green";

        Triangle triangleClone = (Triangle) triangle1.clone();
        System.out.println("Original: " + triangle1);
        System.out.println("Clone: " + triangleClone);
    }
}
