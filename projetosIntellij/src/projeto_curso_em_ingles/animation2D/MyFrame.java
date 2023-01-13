package projeto_curso_em_ingles.animation2D;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanelCoracao panel;
    public MyFrame() {
        panel = new MyPanelCoracao();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
