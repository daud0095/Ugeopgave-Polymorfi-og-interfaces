package del2;

public class Triangle implements Shape{
    private String name;
    private double height;
    private double base;

    public Triangle(String name, double base, double height){
        this.name = name;
        this.base = base;
        this.height = height;

    }
    public double getHeight(){
        return height;
    }

    public double getBase() {
        return base;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea(){
        return 0.5 * height * base;
    }

    @Override
    public double getPerimeter(){
        return 3 * base;
    }

    @Override
    public String getDescription(){
        return "Triangle base " + base + " * height " + height;
    }

}
