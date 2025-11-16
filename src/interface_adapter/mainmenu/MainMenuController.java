package interface_adapter.mainmenu;

import interface_adapter.change_view.ChangeViewController;
import use_case.change_view.ChangeViewInputBoundary;
import use_case.mainmenu.MainMenuInputBoundary;

public class MainMenuController {
    private final MainMenuInputBoundary mainMenuInteractor;
    public MainMenuController(MainMenuInputBoundary mainMenuInteractor) {
        this.mainMenuInteractor = mainMenuInteractor;
    }

    /**
     * Executes the Note related Use Cases.
     * @param note the note to be recorded
     */
    public void execute(String command) {
        switch(command) {
            case "exit":
                mainMenuInteractor.executeExit();
                break;
        }

    }
}
