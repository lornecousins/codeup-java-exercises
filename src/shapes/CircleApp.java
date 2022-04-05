package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(.25);
        Circle circle2 = new Circle(.50);
        System.out.println(circle1.getCircumference());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getCircumference());
        System.out.println(circle2.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());

        Input userInput = new Input();
        double userRadius = userInput.getDouble();

        Circle userCircle=new Circle(userRadius);
        System.out.println(userCircle.getRadius());
        System.out.println(userCircle.getCircumference());
        System.out.println(userCircle.getArea());

    }
}
