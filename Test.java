public class Test {
public static void main(String[] args) {
    Shape shape = new Shape();
    Rectangle rectangle = new Rectangle(10, 20);
    Triangle triangle = new Triangle(10, 20);
    System.out.println(shape.area());
System.out.println(triangle.area());
System.out.println(rectangle.area());

}
}
