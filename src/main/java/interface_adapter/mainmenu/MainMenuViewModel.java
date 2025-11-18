package main.java.interface_adapter.mainmenu;

import main.java.interface_adapter.ViewModel;

public class MainMenuViewModel extends ViewModel<MainMenuState> {
    public MainMenuViewModel() {
        super("note");
        setState(new MainMenuState());
    }
}
