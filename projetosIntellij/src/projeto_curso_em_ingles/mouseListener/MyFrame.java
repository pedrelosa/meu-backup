package projeto_curso_em_ingles.mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label1;
    JLabel label2;
    ImageIcon icon;

    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,500);
        this.setLayout(null);

        icon = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\borbuleta.png");

        label1 = new JLabel(icon);
        label1.setBackground(Color.black);
        label1.setBounds(400,150,200,200);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setOpaque(true);
        label1.addMouseListener(this);

        label2 = new JLabel();
        label2.setBounds(0,350,1000,100);
        label2.setFont(new Font("Arial", Font.BOLD, 30));

        this.add(label1);
        this.add(label2);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Quando o mouse é pressionado e solto sobre o componete
        label1.setBackground(new Color(0xFF0000));
        label2.setText("Quando o mouse é pressionado e solto sobre o componete");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Quando o mouse é pressionado sobre o componete

        label1.setBackground(new Color(0x00FFF7));
        label2.setText("Quando o mouse é pressionado sobre o componete");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Quando o mouse é pressionado sobre o componete e solto fora

        label1.setBackground(new Color(0xC800FF));
        label2.setText("Quando o mouse é pressionado sobre o componete e solto fora");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Quando o ponteiro entra no componente

        label1.setBackground(new Color(0xFFEA00));
        label2.setText("Quando o ponteiro entra no componente");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Quando o ponteiro sai do componente

        label1.setBackground(new Color(0x0022FF));
        label2.setText("Quando o ponteiro sai do componente");
    }
}
