package projeto_curso_em_ingles.animation2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanelCoracao extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image foguete;
    Image fundo;
    Timer timer;
    int xVelocidade = 5;
    int yVelocidade = 3;
    int x = 0;
    int y = 0;
    public MyPanelCoracao() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(new Color(0x2583e5));
        foguete = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\foguete.jpg").getImage();
        fundo = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\city.jpg").getImage();
        timer = new Timer(5,this);
        timer.start();

    }

    @Override
    public void paint(Graphics g){
        super.paint(g);//pintando o fundo

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(fundo, 0, 0, null);
        g2D.drawImage(foguete, x, y, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x + foguete.getWidth(null) >= PANEL_WIDTH || x < 0){
            xVelocidade = xVelocidade * -1;
        }
        if (y + foguete.getHeight(null) >= PANEL_WIDTH || y < 0){
            yVelocidade = yVelocidade * -1;
        }

        x += xVelocidade;
        y += yVelocidade;

        repaint();

    }
}
