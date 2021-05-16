package structural.composite_pattern;
/*
Compose objects into tree structures to represent part-whole hierarchies.
Composite lets clients treat individual objects and compositions of objects
uniformly.

La clase Employee tiene una lista de Employee (como un arbol)
- debe tener un metodo add para agregar un hijo.(add)
- debe tener un metodo para retornar los hijos. (getSubordinates)
 */

public class Main {
    public static void main(String[] arg){

        Employee CEO = new Employee("John","CEO", 30000);
        Employee headSales = new Employee("Robert","Head Sales", 20000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        printEmployee(CEO);
    }

    private static void printEmployee(Employee e){
        System.out.println(e);
        for (Employee employee : e.getSubordinates()) {
            printEmployee(employee);
        }
    }

}
