package projeto_curso_em_ingles.flowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*Layout manager = define o layout natural para componentes com container

        3 comuns managers

        FlowManager =       coloca componentes numa fileira, dimensionado no tamanho preferido
                            se o espaço horizontal no container for mt pequeno, o componente FlowManager
                            vai para proxima linha*/

        JFrame frame = new JFrame("Flow Layout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));//definindo um novo layout flow com os espa
       //                                                                     espaçamentos correspondentes

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());

        for (Integer i = 10; i < 30; i++) {
            panel.add(new JButton(i.toString()));
        }

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(250,250));
        panel1.setBackground(Color.magenta);
        panel1.setLayout(new FlowLayout());

        for (Integer i = 10; i < 30; i++) {
            panel1.add(new JButton(i.toString()));
        }

        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(250,250));
        panel2.setBackground(Color.magenta);
        panel2.setLayout(new FlowLayout());

        for (Integer i = 10; i < 30; i++) {
            panel2.add(new JButton(i.toString()));
        }

        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
    }
}
