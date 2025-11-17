package use_case.portfolio.addStock;

import entities.Portfolio.Portfolio;
import entities.Stock;

public interface AddStockMenuOutputBoundary {

    void prepareSuccessView(String portfolioName, String stockticker);

    void prepareGoBackView();

    void prepareFailureView(String message);
}
