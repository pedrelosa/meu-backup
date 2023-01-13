package projeto_curso_em_ingles.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    Boolean labelvisible = false;

    MyFrame(){

        ImageIcon cshp = new ImageIcon("C:\\Users\\pedre\\Documents\\intellij\\projeto-intellij\\src\\projeto_curso_em_ingles\\src\\csharp.png");


        button = new JButton();
        button.setBounds(100,100,250,100);
        //button.addActionListener(e -> System.out.println("poo"));// fazendo por lambda
        button.addActionListener(this);
        button.setText("Me aperta!!");//set the text of button
        button.setFocusable(false);// para tirar a "borda" em torno do texto
        button.setIcon(cshp);// set the ImageIcon
        button.setHorizontalTextPosition(SwingConstants.CENTER);//deixará o texto no meio em relção a img
        button.setVerticalTextPosition(SwingConstants.BOTTOM);// deixará o texto em baixo da img
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-10);
        button.setForeground(new Color(0x007dff));
        button.setBackground(new Color(0xff8200));
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);//deixa o botão inclicável


        label = new JLabel();
        label.setText("O botão foi clicado");
        label.setBounds(100,200,250,100);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setVisible(labelvisible);

        this.setTitle("Button");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            //System.out.println("poo");
            labelvisible = !labelvisible;
            label.setVisible(labelvisible);
            //button.setEnabled(false);//deixa o botão inclicável e nesse caso só poderia clicar nele uma vez
        }
    }
}
