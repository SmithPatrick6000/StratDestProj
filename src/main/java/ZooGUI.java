package main.java;

import java.awt.*;
import javax.swing.*;

public class ZooGUI extends JFrame{


    public ZooGUI() {
        setTitle("Zoo Simulation");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JLabel title = new JLabel("Virtual Zoo", SwingConstants.CENTER);
        add(title, BorderLayout.NORTH);

        JPanel centPanel = new JPanel(new GridLayout(4, 1, 10, 10));

        JButton lionButton = new JButton("Lion");
        JButton birdButton = new JButton("Bird");
        centPanel.add(lionButton);
        centPanel.add(birdButton);
        add(centPanel, BorderLayout.CENTER);

        JButton moveButton = new JButton("Move");
        JButton soundButton = new JButton("Sound");
        JButton dietButton = new JButton("Diet");
    }
    
}
