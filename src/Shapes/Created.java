package Shapes;

import java.awt.Shape;
import java.io.Serializable;

public class Created implements Serializable{

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Shape shape;
    private String name;
    
    
    public Created(){
        
    }
    
    public Created(Shape shape, String name){
        this.shape = shape;
        this.name = name;
    }
}
