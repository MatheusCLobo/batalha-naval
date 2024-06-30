import javax.swing.*;
import java.awt.*;

public class StatusPanel extends JPanel {
    private JLabel movesLabel;
    private JLabel shipsLabel;

    public StatusPanel() {
        setLayout(new GridLayout(2, 1));

        movesLabel = new JLabel("Nr Jogadas: 0");
        shipsLabel = new JLabel("Navios restantes: 5");

        add(movesLabel);
        add(shipsLabel);
    }
}
