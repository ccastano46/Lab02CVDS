package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    /**
     * Metodo que crea las diferentes figuras
     * @param shapeType la figura que se va a crear
     * @return La figura creada
     */
    public static Shape crea (RegularShapeType shapeType){
        switch (shapeType) {
            case Quadrilateral:
                return new Quadrilateral();
            
            case Triangle:
                return new Triangle();   
            
            case Pentagon:

                return new Pentagon();
            
            case Hexagon:

                return new Hexagon();
        
            default:
                return null;
        }
    }
}
