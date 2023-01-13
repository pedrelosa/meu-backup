package projeto_curso_em_ingles.twoDGraphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image bird;

    public MyPanel() {
        this.setPreferredSize(new Dimension(Main.WIDTH,Main.HEIGHT));
        bird = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\bird.png").getImage();
    }

    @Override
    public void paint(Graphics g){//
        Graphics2D g2D = (Graphics2D) g;//define um grafico 2d a partir do normal

        g2D.setPaint(new Color(0x6517c7));//define a cor do traço
        g2D.setStroke(new BasicStroke(5));//define a espessura do traço
        g2D.drawLine(0,0,500,500);//desenha uma linha

        g2D.setPaint(Color.pink);
        g2D.drawRect(100,100,350,250);//desenha a linha de um retangulo

        g2D.setPaint(new Color(0x9ae838));
        g2D.fillRect(0,0,200,50);//desenha um retangulo cheio

        g2D.setPaint(new Color(0xd81940));
        g2D.drawOval(400,0,100,250);

        g2D.setPaint(new Color(0x998ef2));
        g2D.fillOval(450,200,200,100);

        g2D.setPaint(new Color(0xe7c336));
        g2D.drawArc(100,500,200,200,0,180);
        g2D.fillArc(350,500,200,200,180,220);

        g2D.setPaint(new Color(0x7df0cb));
        int[] x1Points = {600,500,800,};
        int[] y1Points = {500,400,400,};

        g2D.drawPolygon(x1Points,y1Points,3);

        g2D.setPaint(new Color(0x7df0cb));
        int[] x2Points = {800,700,1000,};
        int[] y2Points = {700,400,600,};
        g2D.fillPolygon(x2Points,y2Points,3);

        g2D.setPaint(new Color(0x7d480f));
        g2D.setFont(new Font("Gabriola", Font.BOLD, 70));
        g2D.drawString("texto", 100,700);

        g2D.drawImage(bird,700,100,null);


    }

}
