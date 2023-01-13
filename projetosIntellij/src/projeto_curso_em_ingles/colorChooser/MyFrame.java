package projeto_curso_em_ingles.colorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JLabel label;
    JButton button1;
    JButton button2;
    JColorChooser colorChooser;

    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button1 = new JButton("Escolha a cor do fundo");
        button1.setFont(new Font("Sitka", Font.BOLD, 15));
        button1.addActionListener(this);

        button2 = new JButton("Escolha a cor do texto");
        button2.setFont(new Font("Sitka", Font.BOLD, 15));
        button2.addActionListener(this);

        label = new JLabel("Texto qualquer");
        label.setBackground(Color.WHITE);
        label.setFont(new Font("Sitka", Font.BOLD, 150));
        label.setOpaque(true);

        this.add(button1);
        this.add(button2);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(colorChooser, "Escolha uma cor", Color.PINK);

            label.setBackground(color);

        }else if (e.getSource()==button2){
            colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(colorChooser, "Escolha uma cor", Color.PINK);

            label.setForeground(color);

        }
    }
}
