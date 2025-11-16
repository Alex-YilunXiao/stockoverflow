package view;

import interface_adapter.change_view.ChangeViewController;
import interface_adapter.create_portfolio.CreatePortfolioController;
import interface_adapter.create_portfolio.CreatePortfolioViewModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CreatePortfolioView extends JPanel implements ActionListener, PropertyChangeListener {

    private final String viewName = "CreatePortfolioMenu";
    private final CreatePortfolioViewModel createPortfolioViewModel;

    private CreatePortfolioController createPortfolioController;
    private ChangeViewController changeViewController;

    private final JButton exportPortfolioButton = new JButton("Export Portfolio");
    private final JButton backButton = new JButton("Back");

    public CreatePortfolioView(CreatePortfolioViewModel createPortfolioViewModel) {
        //noteName.setAlignmentX(Component.CENTER_ALIGNMENT); ADD DATE HERE TOO
        this.createPortfolioViewModel = createPortfolioViewModel;
        this.createPortfolioViewModel.addPropertyChangeListener(this);
        this.createPortfolioController = null;
        this.changeViewController = null;

        final JPanel buttons = new JPanel();
        buttons.add(exportPortfolioButton);
        buttons.add(backButton);

        exportPortfolioButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(exportPortfolioButton)) {
                        changeViewController.changeView("CreatePortfolioMenu");

                    }
                }
        );
        backButton.addActionListener(
                evt -> {
                    if (evt.getSource().equals(backButton)) {
                        changeViewController.changeView("MainMenu");

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

    public void setCreatePortfolioController(CreatePortfolioController createPortfolioController) {
        this.createPortfolioController = createPortfolioController;
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
