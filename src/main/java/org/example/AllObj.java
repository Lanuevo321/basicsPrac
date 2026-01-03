package org.example;

import javax.swing.*;
import java.awt.*;



public class AllObj {
    public void Objs(){
        JFrame frame = new JFrame("Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));

        frame.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        frame.add(topPanel, BorderLayout.NORTH);
        topPanel.setSize(new Dimension(500,50));
        topPanel.setBackground(Color.cyan);

        JLabel windowTitle = new JLabel("Welcome to my program baby");
        topPanel.add(windowTitle);
        windowTitle.setFont(new Font("Arial", Font.BOLD, 20));
        windowTitle.setForeground(Color.blue);

        JPanel sidePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20,20));
        frame.add(sidePanel, BorderLayout.WEST);
        sidePanel.setBackground(new Color(34, 139, 34));
        sidePanel.setPreferredSize(new Dimension(300,500));

        JTextField user = new JTextField();
        sidePanel.add(user);
        user.setPreferredSize(new Dimension(200, 30));

        JTextField pass = new JTextField();
        sidePanel.add(pass);
        pass.setPreferredSize(new Dimension(200, 30));








        frame.setVisible(true);
        frame.pack();
    }
}
