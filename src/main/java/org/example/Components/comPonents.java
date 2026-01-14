package org.example.Components;

import javax.swing.*;
import java.awt.*;

public class comPonents {

    /*These components use for login page*/
    public JFrame frame = new JFrame("PRACTISE PROJECTS");
    public JPanel mainPanel = new JPanel(new BorderLayout());
    public JPanel panelCenter = new JPanel(new FlowLayout());

    public JLabel label1 = new JLabel("Username:");
    public JTextField user = new JTextField();

    public JLabel label2 = new JLabel("Password:");
    public JPasswordField pass = new JPasswordField();

    public JButton loginButton = new JButton("Login");



    /*These component use for
    passwordStrengthChecker file*/
    public JLabel forPassStrength = new JLabel();




    /*These components use for login page*/
    public JPanel rightSide = new JPanel();
    public JPanel leftSide = new JPanel();
    public JPanel upSide = new JPanel();
    public JPanel downSide = new JPanel();
    public JPanel centerSide = new JPanel();

    public JLabel forProfile = new JLabel();
    public JButton addSomething = new JButton("Add Something");
    public JButton deleteSomething = new JButton("Delete Something");
    public JButton seeSomething = new JButton("See Something");
    public JButton LogoutAdmin = new JButton("Logout");


    public JLayeredPane rightSideMainPage = new JLayeredPane();
    /*These components use for login page*/
}
