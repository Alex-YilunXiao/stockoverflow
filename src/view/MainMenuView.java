package view;

import interface_adapter.change_view.ChangeViewController;
import interface_adapter.mainmenu.MainMenuController;
import interface_adapter.mainmenu.MainMenuViewModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MainMenuView extends JPanel implements ActionListener, PropertyChangeListener {

    private final String viewName = "MainMenu";
    private final MainMenuViewModel mainMenuViewModel;

    private MainMenuController mainMenuController;
    private ChangeViewController changeViewController;

    private final JButton stockButton = new JButton("Analyze Single Stock");
    private final JButton analyzePortfolioButton = new JButton("Analyze Portfolio");
    private final JButton createPortfolioButton = new JButton("Create/Import Portfolio");
    private final JButton historyStockButton = new JButton("History Single Stock");
    private final JButton exitButton = new JButton("Exit");


    public MainMenuView(MainMenuViewModel mainMenuViewModel) {
        //noteName.setAlignmentX(Component.CENTER_ALIGNMENT); ADD DATE HERE TOO
        this.mainMenuViewModel = mainMenuViewModel;
        this.mainMenuViewModel.addPropertyChangeListener(this);
        this.mainMenuController = null;
        this.changeViewController = null;

        final JPanel buttons = new JPanel();
        buttons.add(stockButton);
        buttons.add(analyzePortfolioButton);
        buttons.add(createPortfolioButton);
        buttons.add(historyStockButton);
        buttons.add(exitButton);

        stockButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(stockButton)) {
                        //MainMenuController.execute(noteInputField.getText());

                    }
                }
        );

        analyzePortfolioButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(analyzePortfolioButton)) {
                        //MainMenuController.execute(noteInputField.getText());

                    }
                }
        );

        createPortfolioButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(createPortfolioButton)) {
                        changeViewController.changeView("CreatePortfolioMenu");

                    }
                }
        );

        historyStockButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(historyStockButton)) {
                        //MainMenuController.execute(noteInputField.getText());

                    }
                }
        );

        exitButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(exitButton)) {
                        mainMenuController.execute("exit"); //fix this later

                    }
                }
        );

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //this.add(noteName);
        this.add(buttons);
    }

    public String getViewName() {
        return viewName;
    }

    public void setMainMenuController(MainMenuController mainMenuController) {
        this.mainMenuController = mainMenuController;
    }

    public void setChangeViewController(ChangeViewController changeViewController) {
        this.changeViewController = changeViewController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click " + e.getActionCommand());
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
