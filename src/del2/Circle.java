package del2;

public class Circle implements Shape{
    private double radius;
    private String name;

    public Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public String getName(){
        return name;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String getDescription(){
        return "Circle radius " + radius;
    }
}
