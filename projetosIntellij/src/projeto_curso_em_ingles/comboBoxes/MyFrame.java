package projeto_curso_em_ingles.comboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ConcurrentModificationException;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        comboBox = new JComboBox(animals);
        comboBox.setFocusable(false);
        comboBox.addItem("CAVALO");
        comboBox.insertItemAt("PIRANHAAA", 0);
        comboBox.setEditable(true);
        comboBox.setSelectedIndex(1);
        comboBox.removeItem("bird");
        comboBox.removeItemAt(3);
        //comboBox.removeAllItems();
        comboBox.addActionListener(this);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
