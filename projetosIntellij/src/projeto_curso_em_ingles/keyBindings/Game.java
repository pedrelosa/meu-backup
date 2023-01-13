package projeto_curso_em_ingles.keyBindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    int velocidade = 10;
    public Game() {

        frame = new JFrame("Key Binding Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.pink);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"cimaQualQuerCoisa");
        label.getInputMap().put(KeyStroke.getKeyStroke('w'),"cimaQualQuerCoisa");
        label.getActionMap().put("cimaQualQuerCoisa", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"baixoQualQuerCoisa");
        label.getInputMap().put(KeyStroke.getKeyStroke('s'),"baixoQualQuerCoisa");
        label.getActionMap().put("baixoQualQuerCoisa", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'),"esquedaQualQuerCoisa");
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"esquedaQualQuerCoisa");
        label.getActionMap().put("esquedaQualQuerCoisa", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'),"direitaQualQuerCoisa");
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"direitaQualQuerCoisa");
        label.getActionMap().put("direitaQualQuerCoisa", rightAction);


        frame.add(label);
        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-velocidade);

        }
    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+velocidade);

        }
    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-velocidade,label.getY());

        }
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+velocidade,label.getY());

        }
    }

}
