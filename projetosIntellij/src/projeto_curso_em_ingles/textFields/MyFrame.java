package projeto_curso_em_ingles.textFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Enviar");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolar", Font.BOLD, 42));
        textField.setForeground(new Color(0xFFC700FF));
        textField.setBackground(new Color(0xFF5FFF00));
        textField.setCaretColor(new Color(0xFF0000));
        textField.setText("teste");
        textField.selectAll();

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println(textField.getText());
        }
    }
}
