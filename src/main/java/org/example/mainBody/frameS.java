package org.example.mainBody;
import org.example.Components.comPonents;
import org.example.checkPassword.passwordStrengthChecker;

import javax.swing.*;
import java.awt.*;

public class frameS {



    public void proG(){
        comPonents components = new comPonents();
        components.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        components.frame.setPreferredSize(new Dimension(1200,670));

        components.frame.add(components.panelCenter);
        components.panelCenter.add(components.pass);


        components.pass.setPreferredSize(new Dimension(
                300, 30
        ));

        char [] passChar = components.pass.getPassword();
        String pass = new String(passChar);

        components.panelCenter.add(components.forPassStrength);

        String strength = passwordStrengthChecker.passwordChecker(pass);
        components.forPassStrength.setText(strength);

        components.frame.pack();
        components.frame.setVisible(true);
    }


}
