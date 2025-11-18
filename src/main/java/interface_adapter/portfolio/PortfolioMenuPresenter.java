package main.java.interface_adapter.portfolio;

import main.java.entities.Portfolio.Portfolio;
import main.java.use_case.portfolio.PortfolioMenuOutputBoundary;

public class PortfolioMenuPresenter implements PortfolioMenuOutputBoundary {
    private final PortfolioMenuViewModel portfolioMenuViewModel;

    public PortfolioMenuPresenter(PortfolioMenuViewModel portfolioMenuViewModel) {
        this.portfolioMenuViewModel = portfolioMenuViewModel;
    }

    @Override
    public void prepareAddStockView(Portfolio portfolio) {

    }

    @Override
    public void prepareRemoveStockView(Portfolio portfolio) {

    }

    @Override
    public void prepareSimulationView(Portfolio portfolio) {

    }

    @Override
    public void prepareCompareView(Portfolio portfolio, Portfolio comparePortfolio) {

    }

    @Override
    public void prepareSaveView(Portfolio portfolio) {

    }

    @Override
    public void prepareFailView(String message) {

    }

    @Override
    public void prepareExitView() {

    }
}
