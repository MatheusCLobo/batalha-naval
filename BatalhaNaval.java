import javax.swing.*;
import java.awt.*;

public class BatalhaNaval extends JFrame {
    private GridPanel gridPanel;
    private ControlsPanel controlsPanel;
    private StatusPanel statusPanel;

    public BatalhaNaval() {
        setTitle("Batalha Naval");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        gridPanel = new GridPanel();
        controlsPanel = new ControlsPanel();
        statusPanel = new StatusPanel();

        add(gridPanel, BorderLayout.CENTER);
        add(controlsPanel, BorderLayout.SOUTH);
        add(statusPanel, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BatalhaNaval().setVisible(true);
            }
        });
    }
}
