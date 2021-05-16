package structural.flyweight_pattern;
/*
Flyweight pattern is primarily used to reduce the number of
objects created and to decrease memory footprint and increase performance.

In this example, we’re going to render a forest (1.000.000 trees)! Each tree will be represented by its own object that has some state (coordinates, texture and so on). Although the program does its primary job, naturally, it consumes a lot of RAM.
The reason is simple: too many tree objects contain duplicate data (name, texture, color). That’s why we can apply the Flyweight pattern and store these values inside separate flyweight objects (the TreeType class). Now, instead of storing the same data in thousands of Tree objects, we’re going to reference one of the flyweight objects with a particular set of values.
 */

import java.awt.*;

public class Main {
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;
    static int CANVAS_SIZE = 500;
    static int TREE_BYTES = 8;
    static int TREE_TYPE_BYTES = 30;


    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println("_________________________________");
        System.out.println("Trees drawn: " + TREES_TO_DRAW );
        System.out.println("Tree types created: " + TreeFactory.getTreeTypes().size());
        System.out.println("");
        System.out.println("Memory usage:");
        System.out.print("Tree size ("+ TREE_BYTES + " bytes) * " + TREES_TO_DRAW);
        System.out.println(" + TreeTypes size (~"+ TREE_TYPE_BYTES +" bytes) * " + TREE_TYPES + "");
        System.out.println("");
        System.out.println("Total: " + convertByteToMegabyte(TREES_TO_DRAW * TREE_BYTES + TREE_TYPES * TREE_TYPE_BYTES) +
                " MB (instead of " + convertByteToMegabyte(TREES_TO_DRAW * (TREE_TYPE_BYTES+TREE_BYTES)) + "MB)");
        System.out.println("Total: " + (TREES_TO_DRAW * TREE_BYTES + TREE_TYPES * TREE_TYPE_BYTES) +
                " Bytes (instead of " + (TREES_TO_DRAW * (TREE_TYPE_BYTES+TREE_BYTES)) + " Bytes)");
        System.out.println("_________________________________");

        forest.removeAll();
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static Long convertByteToMegabyte(Integer bytes){
        long  MEGABYTE = 1024L * 1024L;
        return bytes / MEGABYTE ;
    }
}
