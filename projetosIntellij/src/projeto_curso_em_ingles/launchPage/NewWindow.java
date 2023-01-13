package projeto_curso_em_ingles.launchPage;

import com.sun.jdi.request.MonitorContendedEnteredRequest;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame("New Window");
    JLabel label = new JLabel("Nova Página!!!");

    NewWindow() {

        label.setBounds(100, 160, 200, 40);
        label.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(label);
        frame.setVisible(true);
    }

}
