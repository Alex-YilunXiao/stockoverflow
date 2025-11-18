package main.java.interface_adapter.portfolio.addStock;

import main.java.entities.Portfolio.Portfolio;
import main.java.entities.Stock;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddStockMenuState {

    private Portfolio portfolio;

    private String stockNotFoundError;

    private Stock stock;

}
