package app;


public class MainMenu {
    public static void main(String[] args) {

        final MainMenuBuilder builder = new MainMenuBuilder();
//        Stock s = new Stock("ASDB", "asdasdasd");
//        System.out.println(s.getTicker());
        builder.addMainView().build().setVisible(true);
    }
}
