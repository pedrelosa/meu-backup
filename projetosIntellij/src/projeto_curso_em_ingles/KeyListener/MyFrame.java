package projeto_curso_em_ingles.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon nave;
    int velocidade = 10;

    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setBackground(Color.black);
        this.setLayout(null);
        this.addKeyListener(this);

        nave = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\nave.png");

        label = new JLabel(nave);
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    /* ideia básica é que keyTyped é usado para localizar caracteres
     que são digitados e keyPressed é usado para obter pressionamentos de teclas brutos.*/

    @Override
    public void keyTyped(KeyEvent e) {
        //KeyTyped = Retorna o char retornado como "A" e "a". Usa KeyChar, char output
        if (e.getKeyChar()=='w'){
            label.setLocation(label.getX(), label.getY()-velocidade);
            if (e.getKeyChar()=='a'){
                label.setLocation(label.getX()-velocidade, label.getY());
            }else if (e.getKeyChar()=='d'){
                label.setLocation(label.getX()+velocidade, label.getY());
            }
        }
        if (e.getKeyChar()=='s'){
            label.setLocation(label.getX(), label.getY()+velocidade);
            if (e.getKeyChar()=='a'){
                label.setLocation(label.getX()-velocidade, label.getY());
            }else if (e.getKeyChar()=='d'){
                label.setLocation(label.getX()+velocidade, label.getY());
            }
        }
        if (e.getKeyChar()=='a'){
            label.setLocation(label.getX()-velocidade, label.getY());
        }
        if (e.getKeyChar()=='d'){
            label.setLocation(label.getX()+velocidade, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //KeyPressed = Retorna apenas a tecla "a", ou "shift" Invocado
        // quando uma tecla é pessionada para baixo. Usa keyCode, int output
        if (e.getKeyCode()==KeyEvent.VK_W){
            label.setLocation(label.getX(), label.getY()-velocidade);
            if (e.getKeyCode()==KeyEvent.VK_A){
                label.setLocation(label.getX()-velocidade, label.getY());
            }else if (e.getKeyCode()==KeyEvent.VK_D){
                label.setLocation(label.getX()+velocidade, label.getY());
            }
        }
        if (e.getKeyCode()==KeyEvent.VK_S){
            label.setLocation(label.getX(), label.getY()+velocidade);
            if (e.getKeyCode()==KeyEvent.VK_A){
                label.setLocation(label.getX()-velocidade, label.getY());
            }else if (e.getKeyCode()==KeyEvent.VK_D){
                label.setLocation(label.getX()+velocidade, label.getY());
            }
        }
        if (e.getKeyCode()==KeyEvent.VK_A){
            label.setLocation(label.getX()-velocidade, label.getY());
        }
        if (e.getKeyCode()==KeyEvent.VK_D){
            label.setLocation(label.getX()+velocidade, label.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //KeyRealised = chamado sempre que uma tecla é "liberada", ou solta

        System.out.println("Você \"Liberou\" a key char: " + e.getKeyChar());
        System.out.println("Você \"Liberou\" a key code: " + e.getKeyCode());

    }
}
