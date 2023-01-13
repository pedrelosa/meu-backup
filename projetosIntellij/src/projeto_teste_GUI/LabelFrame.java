package projeto_teste_GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class LabelFrame extends JFrame {

    private  JLabel label1;
    private  JLabel label2;
    private  JLabel label3;

    public LabelFrame() {
        super("Testando o LabelFrame");
        setLayout(new FlowLayout());

        label1 = new JLabel("Label com texto");
        label1.setToolTipText("Esse é label1");
        add(label1);

        Icon bug = new ImageIcon(Objects.requireNonNull(getClass().getResource("bug.png")));
        label2 = new JLabel("Label com texto e ícone", bug, SwingConstants.LEFT);
        label2.setToolTipText("Esse é o label2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label com texto e icone com butão");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Esse é o label3");
        add(label3);




    }


}
