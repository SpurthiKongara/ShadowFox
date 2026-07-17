import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BankingSystemGUI gui = new BankingSystemGUI();
            gui.setVisible(true);
        });
    }
}
