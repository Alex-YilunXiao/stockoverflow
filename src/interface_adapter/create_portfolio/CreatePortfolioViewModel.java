package interface_adapter.create_portfolio;

import interface_adapter.ViewModel;

public class CreatePortfolioViewModel extends ViewModel<CreatePortfolioState> {
    public CreatePortfolioViewModel() {
        super("create portfolio");
        setState(new CreatePortfolioState());
    }
}
