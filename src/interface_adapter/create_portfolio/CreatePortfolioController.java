package interface_adapter.create_portfolio;

import use_case.create_portfolio.CreatePortfolioInputBoundary;
import use_case.create_portfolio.CreatePortfolioInteractor;
import use_case.mainmenu.MainMenuInputBoundary;

public class CreatePortfolioController {
    private final CreatePortfolioInputBoundary createPortfolioInteractor;
    public CreatePortfolioController(CreatePortfolioInputBoundary createPortfolioInteractor) {
        this.createPortfolioInteractor = createPortfolioInteractor;
    }

    /**
     * Executes the Note related Use Cases.
     * @param note the note to be recorded
     */
    public void execute(String command) {
        switch(command) {
            case "exit":
                //createPortfolioInteractor.executeExit();
                break;
        }

    }
}
