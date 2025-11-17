package view;

import interface_adapter.portfolio.PortfolioMenuController;
import interface_adapter.portfolio.PortfolioMenuViewModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PortfolioMenuView extends JPanel implements ActionListener, PropertyChangeListener {

    private final PortfolioMenuViewModel portfolioMenuViewModel;
    private final PortfolioMenuController portfolioMenuController;

    private final JButton addButton = new JButton(PortfolioMenuViewModel.ADD_BUTTON_LABEL);
    private final JButton removeButton = new JButton(PortfolioMenuViewModel.REMOVE_BUTTON_LABEL);
    private final JButton simulationButton = new JButton(PortfolioMenuViewModel.SIMULATION_BUTTON_LABEL);
    private final JButton selectAllButton = new JButton(PortfolioMenuViewModel.SELECT_ALL_BUTTON_LABEL);
    private final JButton clearSelectionButton = new JButton(PortfolioMenuViewModel.CLEAR_SELECTION_BUTTON_LABEL);
    private final JButton savePortfolioButton =  new JButton(PortfolioMenuViewModel.SAVE_PORTFOLIO_BUTTON_LABEL);
    private final JButton exitButton = new JButton(PortfolioMenuViewModel.EXIT_BUTTON_LABEL);

    public PortfolioMenuView(PortfolioMenuViewModel portfolioMenuViewModel) {
        //noteName.setAlignmentX(Component.CENTER_ALIGNMENT); ADD DATE HERE TOO
        this.portfolioMenuViewModel = portfolioMenuViewModel;
        this.portfolioMenuViewModel.addPropertyChangeListener(this);
        this.portfolioMenuController = null;


        final JPanel buttons = new JPanel();
        buttons.add(addButton);
        buttons.add(removeButton);
        buttons.add(simulationButton);
        buttons.add(selectAllButton);
        buttons.add(clearSelectionButton);
        buttons.add(savePortfolioButton);
        buttons.add(exitButton);

        addButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(addButton)) {
                        //MainMenuController.execute(noteInputField.getText());
                        this.portfolioMenuController.getPortfolioMenuInputBoundary().executeAddStock();
                    }
                }
        );

        removeButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(removeButton)) {


                    }
                }
        );

        simulationButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(simulationButton)) {
                        //MainMenuController.execute(noteInputField.getText());

                    }
                }
        );

        selectAllButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(selectAllButton)) {
                        //MainMenuController.execute(noteInputField.getText());

                    }
                }
        );

        clearSelectionButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(clearSelectionButton)) {


                    }
                }
        );

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //this.add(noteName);
        this.add(buttons);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
