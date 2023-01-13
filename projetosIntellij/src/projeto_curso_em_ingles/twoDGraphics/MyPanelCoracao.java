package projeto_curso_em_ingles.twoDGraphics;

import javax.swing.*;
import java.awt.*;

public class MyPanelCoracao extends JPanel {

    Image heart;

    public MyPanelCoracao() {
        this.setPreferredSize(new Dimension(Main.WIDTH,Main.HEIGHT));
        heart = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\heart1.png").getImage();
    }

    @Override
    public void paint(Graphics g){//
        Graphics2D g2D = (Graphics2D) g;//define um grafico 2d a partir do normal
        g2D.drawImage(heart,100,0,null);

        g2D.setPaint(new Color(0x8600FF));
        g2D.setFont(new Font("Candara", Font.BOLD, 130));
        g2D.drawString("Tiamu", 320,400);


    }

}
