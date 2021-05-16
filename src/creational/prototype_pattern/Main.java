package creational.prototype_pattern;

/*
Specify the kinds of objects to create using a prototypical instance,
and create new objects by coping this prototype.

Ejemplo: método copy de java
Crear nuevos objetos a partir de otros existentes.
 */
public class Main {
    public static void main(String[] args) {

        EmployeeRecord employedBase = new EmployeeRecord(1, "", "Manager", 60000, "calle");
        employedBase.showRecord();
        System.out.println("\n");

        EmployeeRecord employed2 = (EmployeeRecord) employedBase.getClone();
        employed2.setName("Juan");
        employed2.showRecord();
    }
}
