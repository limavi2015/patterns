package structural.proxy_pattern;

/*
Provide a surrogate or placeholder for another object to control access to it.
El objeto real y el proxy usan la misma interfaz.

proxy: crear un control de acceso a un objeto.
Virtual proxy: el objetivo es retrasar la creacion del objeto lo maximo posible
*/
public class Main {
    public static void main(String[] arg){
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
