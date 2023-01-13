package projeto_curso_em_ingles.layeredPane;

import javax.management.loading.ClassLoaderRepository;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /* Layered Pane =   Swing container that provides
        *                   third dimension for position components
        *                   ex. depth, Z-index*/

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.magenta);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.cyan);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        //dá para estabelecer o nível da ‘layer’ de acordo com um Integer
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(2));

        JFrame frame =  new JFrame("Layred Pane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
