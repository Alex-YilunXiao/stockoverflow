package use_case.simulation;

import java.util.Map;
import java.time.LocalDate;

public interface StockDataAccessInterface {
    /**
     * Returns a map of date to closing price for the given ticker.
     * Throws RuntimeException if ticker not found or data unavailable.
     */
    Map<LocalDate, Double> getHistoricalPrices(String ticker);
}
