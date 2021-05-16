package Behabioral.command_pattern;
/*
Encapsulate a request as an object, thereby letting you parameterize clients with
different requests, queue or log requests and support undoable operations.

This object is used to encapsulate all information needed to perform an action.
Four terms always associated with the command pattern are:
-command
-receiver
-invoker
-client: Main.class

Is easily extendible, we can add new action methods in receivers and
create new Command implementations without changing the client code.
 */
public class Main {
    public static void main(String[] arg){
        StockReceiver abcStock = new StockReceiver();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        BrokerInvoker broker = new BrokerInvoker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
