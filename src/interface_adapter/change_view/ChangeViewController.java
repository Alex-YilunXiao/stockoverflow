package interface_adapter.change_view;

import use_case.change_view.ChangeViewInputBoundary;

public class ChangeViewController {

    private final ChangeViewInputBoundary changeViewInteractor;

    public ChangeViewController(ChangeViewInputBoundary changeViewInteractor) {
        this.changeViewInteractor = changeViewInteractor;
    }

    public void onMainMenuClick() {
        changeViewInteractor.changeToMainMenu();
    }

    public void onCreatePortfolioClick() {
        changeViewInteractor.changeToCreatePortfolio();
    }

}
