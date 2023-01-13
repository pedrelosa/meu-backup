package projeto_curso_em_ingles.twoDGraphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;

    public MyFrame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//define que quando se clica no "x", o programa encerra
        this.setSize(Main.WIDTH,Main.HEIGHT);//define tamanho da tela
        this.setResizable(false);

        panel = new MyPanel();

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);//define a localização para o ccentro da teça
        this.setVisible(true);//torna a janela visível

    }


    /*@Override
    public void paint(Graphics g){//
        Graphics2D g2D = (Graphics2D) g;//define um grafico 2d a partir do normal

        g2D.drawLine(0,0,500,500);//define uma linha

    }

    ---------------------------------- SE ISSO FOR COLOCADO AQUI SERÁ CONSIDERADO O MENU BAR, POR ISSO COLOCAR NO MyPanel

    */

}
