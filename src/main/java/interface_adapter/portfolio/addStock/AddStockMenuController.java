package main.java.interface_adapter.portfolio.addStock;

import lombok.Getter;
import main.java.use_case.portfolio.addStock.AddStockMenuInteractor;

public class AddStockMenuController {
    @Getter
    private final AddStockMenuInteractor addStockMenuInteractor;

    public AddStockMenuController(AddStockMenuInteractor addStockMenuInteractor) {
        this.addStockMenuInteractor = addStockMenuInteractor;
    }
    /**
     * Executes the Note related Use Cases.
     * @param command the note to be recorded
     */
}
