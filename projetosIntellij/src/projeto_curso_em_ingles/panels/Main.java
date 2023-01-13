package projeto_curso_em_ingles.panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JPanel = um componente GUI que tem funcões para segurar outros componentes GUI

        //definindo um imageIcon para usar no exemplo
        ImageIcon ney = new ImageIcon("C:\\Users\\pedre\\Documents\\intellij\\projeto-intellij\\src\\projeto_curso_em_ingles\\src\\pombo.jpg");
        JLabel label = new JLabel();
        label.setText("tu é gay?");
        label.setIcon(ney);
/*
        label.setVerticalAlignment(SwingConstants.BOTTOM);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
*/
        label.setBounds(0,0,75, 75);



        //definindo alguns paineis, backgroundcolors e tamanhos
        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(0xf30002));
        redPanel.setBounds(0,0,250,250);//definindo limites
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(0x007dff ));
        bluePanel.setBounds(250,0,250,250);//definindo limites
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(0x45d54f  ));
        greenPanel.setBounds(0,250,500,250);//definindo limites
        greenPanel.setLayout(null);

        JFrame frame = new JFrame("Panels");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
