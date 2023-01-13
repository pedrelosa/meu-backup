package projeto_curso_em_ingles.dragAndDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon heart = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\heart.jpg");
    final int WIDTH  = heart.getIconWidth();
    final int HEIGHT = heart.getIconHeight();
    Point imageCorner;
    Point previousPoint;


    DragPanel() {

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        heart.paintIcon(this,g, (int) (imageCorner.getX()), (int) (imageCorner.getY()));
    }

    private class ClickListener extends MouseAdapter{

        public void mousePressed(MouseEvent e){
            previousPoint = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter{

        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPoint = e.getPoint();

            imageCorner .translate(
                    (int) (currentPoint.getX() - previousPoint.getX()),
                    (int) (currentPoint.getY() - previousPoint .getY())
            );
            previousPoint = currentPoint;
            repaint();

        }
    }

}
