package main.java.interface_adapter.portfolio.addStock;

import main.java.entities.Portfolio.Portfolio;
import main.java.interface_adapter.ViewModel;

public class AddStockMenuViewModel extends ViewModel<AddStockMenuState> {
    public AddStockMenuViewModel(Portfolio portfolio) {
        super("addStock");
        setState(new AddStockMenuState());
    }
}
