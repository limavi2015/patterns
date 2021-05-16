package structural.facade_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Provide a unified interface to set of interfaces in a subsystem.
Defines a higher-level interface that makes the subsystem easier to use.

Oculta las complejidad del sistema y proporciona una sola clase con
métodos simplificados requeridos por el cliente, esta clase se encarga
de los llamados a los metodos del sistema existentes.
 */
public class Main {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException{
        do{
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("            1. IPHONE.              \n");
            System.out.print("            2. SAMSUNG.              \n");
            System.out.print("            3. BLACKBERRY.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            ShopKeeper sk=new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    sk.iphoneSale();
                }
                break;
                case 2:
                {
                    sk.samsungSale();
                }
                break;
                case 3:
                {
                    sk.blackberrySale();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        }while(choice!=4);
    }
}
