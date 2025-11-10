package interface_adapter.mainmenu;

import interface_adapter.ViewModel;

public class MainMenuViewModel extends ViewModel<MainMenuState> {
    public MainMenuViewModel() {
        super("note");
        setState(new MainMenuState());
    }
}
