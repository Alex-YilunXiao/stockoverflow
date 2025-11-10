package app.MainMenu;

import interface_adapter.mainmenu.MainMenuViewModel;
import view.MainMenuView;

import javax.swing.*;
import java.awt.*;

public class MainMenuBuilder {
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final double WIDTH = screenSize.getWidth();
    public static final double HEIGHT = screenSize.getHeight();
    //private NoteDataAccessInterface noteDAO;
    private MainMenuViewModel mainMenuViewModel = new MainMenuViewModel();
    private MainMenuView mainMenuView;

    public MainMenuBuilder addMainView() {
        mainMenuViewModel = new MainMenuViewModel();
        mainMenuView = new MainMenuView(mainMenuViewModel);
        return this;
    }

    /**
     * Builds the application.
     * @return the JFrame for the application
     */
    public JFrame build() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Stockoverflow");
        frame.setSize((int) WIDTH, (int) HEIGHT);

        frame.add(mainMenuView);

        // refresh so that the note will be visible when we start the program
        //noteInteractor.executeRefresh();

        return frame;

    }

}

