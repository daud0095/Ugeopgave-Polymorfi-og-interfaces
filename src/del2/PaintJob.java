package del2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PaintJob {
    private String name;
    private ArrayList<Shape> surfaces = new ArrayList<>();
    private ArrayList<Shape> deduction = new ArrayList<>();

    public PaintJob(String name){
        this.name = name;
    }

    public void addSurface(Shape s){
        surfaces.add(s);
    }
    public void addDeduction(Shape s){
        deduction.add(s);
    }
    public double getTotalSurface(){
        int total = 0;
        for(Shape s : surfaces){
            total += s.getArea();
        }
        return total;
    }

    public double getTotalDeductions(){
        int total = 0;
        for(Shape d : deduction){
            total += d.getArea();
        }
        return total;
    }

    public double getPainttableArea(){
        return getTotalSurface() - getTotalDeductions();
    }

    public void printSummary(){
        System.out.println("=== Malerberegner: " + name + " ===");

        System.out.println("Overflader:");
        for(Shape s : surfaces){


        }
    }
}
