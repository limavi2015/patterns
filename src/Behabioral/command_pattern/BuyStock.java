package Behabioral.command_pattern;

public class BuyStock implements OrderCommand {
    private StockReceiver abcStock;

    public BuyStock(StockReceiver abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
