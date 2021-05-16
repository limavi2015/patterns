package creational.factory_method_pattern;
/*
Factory method
Define an Interface(class) for creating an object,
but let subclasses decide which class to instantiate.

Si tengo un objeto que puede ser de distintos tipos.
*/



public class Main {
    public static void main (String[] arg){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
