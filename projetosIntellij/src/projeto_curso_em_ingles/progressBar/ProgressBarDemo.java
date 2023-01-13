package projeto_curso_em_ingles.progressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame("Barra de progresso");
    JProgressBar bar = new JProgressBar();
    public ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(20,20,380,80);
        bar.setStringPainted(true);
        bar.setFont(new Font("Book Antiqua", Font.BOLD, 25));
        bar.setForeground(Color.blue);
        bar.setBackground(Color.yellow);

        frame.add(bar);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();

//        96339484
    }

    public void fill(){
        for (int i = 0; i < 101; i++) {
            bar.setValue(i);

            try {
                Thread.sleep(50);
            }catch (InterruptedException ignored){

            }

        }
        bar.setString("Feito :)");
    }

}
