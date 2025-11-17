package use_case.portfolio.addStock;

import entities.Portfolio.Portfolio;
import entities.Stock;

public interface AddstockMenuInputBoundary {

    void executeAddstock(String stockticker);

    void executeExit();
}
