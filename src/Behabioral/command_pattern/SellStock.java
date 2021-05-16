package Behabioral.command_pattern;

public class SellStock implements OrderCommand {
    private StockReceiver abcStock;

    public SellStock(StockReceiver abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
