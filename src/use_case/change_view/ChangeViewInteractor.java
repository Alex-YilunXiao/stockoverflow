package use_case.change_view;

public class ChangeViewInteractor implements ChangeViewInputBoundary {

    private final ChangeViewOutputBoundary changeScreenOutputBoundary;

    public ChangeViewInteractor(ChangeViewOutputBoundary changeScreenOutputBoundary){
        this.changeScreenOutputBoundary = changeScreenOutputBoundary;
    }

    @Override
    public void changeToMainMenu() {
        final ChangeViewOutputData outputData = new ChangeViewOutputData("MainMenu");
        changeScreenOutputBoundary.prepareView(outputData);
    }

    @Override
    public void changeToCreatePortfolio() {
        final ChangeViewOutputData outputData = new ChangeViewOutputData("CreatePortfolioMenu");
        changeScreenOutputBoundary.prepareView(outputData);
    }
}
