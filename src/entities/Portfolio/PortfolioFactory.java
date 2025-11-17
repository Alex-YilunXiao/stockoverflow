package entities.Portfolio;

import entities.Stock;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class PortfolioFactory {
    public Portfolio createPortfolio(String portfolioName) {
        ArrayList<String> emptyStockList = new ArrayList<>();
        LocalTime time = LocalTime.now();
        return new Portfolio(portfolioName, emptyStockList, time);
    }
}
