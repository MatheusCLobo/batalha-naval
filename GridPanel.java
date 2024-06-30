import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {
    private JButton[][] gridButtons;

    public GridPanel() {
        setLayout(new GridLayout(8, 8));
        gridButtons = new JButton[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                gridButtons[i][j] = new JButton();
                add(gridButtons[i][j]);
            }
        }
    }
}
