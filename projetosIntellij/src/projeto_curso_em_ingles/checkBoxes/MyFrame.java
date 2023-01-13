package projeto_curso_em_ingles.checkBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon checkIcon;
    ImageIcon unCheckIcon;
    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkIcon = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\check.png");
        unCheckIcon = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\unchecked.png");

        button = new JButton("Enviar");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("Eu não sou um robô");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolar", Font.BOLD, 28));
        checkBox.setIcon(unCheckIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
    }
}
