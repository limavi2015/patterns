package creational.singleton_pattern;

public class Main {
     public static void main(String[] arg){
         SingletonEnum singleton = SingletonEnum.INSTANCE;

         System.out.println(singleton.getValue());
         singleton.setValue(2);
         System.out.println(singleton.getValue());

         singleton.setValue(3);
         System.out.println(singleton.getValue());
     }
}
