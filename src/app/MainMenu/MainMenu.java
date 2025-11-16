package app.MainMenu;


import entities.Stock;

import javax.swing.*;

public class MainMenu {
    public static void main(String[] args) {

        final MainMenuBuilder builder = new MainMenuBuilder();
//        Stock s = new Stock("ASDB", "asdasdasd");
//        System.out.println(s.getTicker());
        final JFrame application = builder
                .addMainView()
                .addCreatePortfolioView()
                .addChangeViewUseCase()
                .addMainViewUseCase()
                .build();

        application.setExtendedState(JFrame.MAXIMIZED_BOTH);
        application.setLocationRelativeTo(null);
        application.setVisible(true);
    }
}
