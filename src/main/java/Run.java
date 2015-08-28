import com.sun.prism.*;
import ui.GraphicsPanel;

import javax.swing.*;
import java.awt.*;

public class Run {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Space Model");
        mainFrame.setSize(1000, 1000);
        mainFrame.setResizable(false);
        mainFrame.setUndecorated(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new GridBagLayout());
        GraphicsPanel graphicsPanel = new GraphicsPanel();
        mainFrame.add(graphicsPanel,new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,
               + GridBagConstraints.BOTH,new Insets(2,2,2,2),0,0));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);


    }
}
