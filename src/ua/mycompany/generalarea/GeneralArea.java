/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.mycompany.generalarea;

import java.util.ArrayList;
import java.util.List;
import ua.mycompany.generalarea.entities.Circle;
import ua.mycompany.generalarea.entities.Rectangle;
import ua.mycompany.generalarea.entities.Shape;
import ua.mycompany.generalarea.entities.Square;

/**
 *
 * @author Igor Gayvan
 */
public class GeneralArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(3, 4));
        shapes.add(new Circle(3));
        shapes.add(new Square(5));

        double generalArea = 0;
        for (Shape shape : shapes) {
            generalArea += shape.area();
        }

        System.out.printf("General area of all objects: %f\n", generalArea);
    }

}
