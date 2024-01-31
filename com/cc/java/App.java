package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rect = new Rectangle(22,55);
        Triangle tria = new Triangle(22,55);
        Circle circ = new Circle(22);


        output(Double.toString(rect.Area()));

        output(Double.toString(tria.Area()));

        output(Double.toString(circ.Area()));

        output(Double.toString(areaDiff(rect,tria)));

    }
    public static  double areaDiff(Shape r,Shape t){
        return r.Area() - t.Area();
    }

  

   


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

