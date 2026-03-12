package del2;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String name;

    public Rectangle(String name, double width, double height){
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public String getName(){
        return name;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public String getDescription(){
        return "Rectangle " + width + " * " + height;
    }
}
