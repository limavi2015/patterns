package Behabioral.command_pattern;

import java.util.ArrayList;
import java.util.List;

public class BrokerInvoker {
    private List<OrderCommand> orderList = new ArrayList<>();

    public void takeOrder(OrderCommand order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (OrderCommand order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
