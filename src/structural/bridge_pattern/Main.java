package structural.bridge_pattern;
/*
Decouple an abstraction from it implementation so that the two
can vary independently.
The bridge pattern is useful when both the class and what it does vary.

Eg: Company that manufactures various types of vehicles, like bikes or cars.
There are frequent changes in the vehicle, as new models of bikes and cars
can be introduced and have different processes to manufacture them.

Workshop = bridge between types of vehicles and concrete workshops (implementors)

Dos jerarquias diferentes de tipos y un puente que las una.
solo se requieren adaptaciones en las clases puentes de las dos jerarquias
*/
public class Main {
    public static void main(String[] arg){
        Vehicle bike = new Bike();
        bike.joinWorkshop(new ProduceWorkShop());
        bike.joinWorkshop(new AssembleWorkShop());
        bike.manufacture();

        Vehicle car = new Car();
        car.joinWorkshop(new ProduceWorkShop());
        car.joinWorkshop(new AssembleWorkShop());
        car.joinWorkshop(new PaintWorkShop());
        car.manufacture();
    }
}
