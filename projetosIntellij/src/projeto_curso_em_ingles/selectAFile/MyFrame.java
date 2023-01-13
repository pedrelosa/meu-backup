package projeto_curso_em_ingles.selectAFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JFileChooser fileChooser;
    File file;

    MyFrame(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Selecione um arquivo");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("C:\\Users\\pedre\\Documents"));// pode passar como argumento "." para a pasta atual

            //int resposta = fileChooser.showOpenDialog(null);
//            fileChooser.showDialog(null, "ola");
            int resposta = fileChooser.showSaveDialog(null);

            if (resposta == JFileChooser.APPROVE_OPTION){
                file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

        }
    }
}
