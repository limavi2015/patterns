package structural.decorator_pattern;
/*
Attach additional responsabilities to an object dinamically.
Decorators provide a flexible alternative to subclassing
for extending fuctionality.

Añadir funcionalidad a objetos existentes, utiliza la composicion de objetos.
*/
public class Main {
    public static void main(String[] arg){
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car sportsAndLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsAndLuxuryCar.assemble();
    }
}
