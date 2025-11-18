package main.java.use_case.portfolio;

import main.java.entities.Portfolio.Portfolio;

public interface PortfolioMenuOutputBoundary {
    void prepareAddStockView(Portfolio portfolio);

    void prepareRemoveStockView(Portfolio portfolio);

    void prepareSimulationView(Portfolio portfolio);

    void prepareCompareView(Portfolio portfolio, Portfolio comparePortfolio);

    void prepareSaveView(Portfolio portfolio);

    void prepareFailView(String message);

    void prepareExitView();
}
