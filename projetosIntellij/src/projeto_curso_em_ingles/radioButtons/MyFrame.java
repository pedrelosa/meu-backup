package projeto_curso_em_ingles.radioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizza;
    JRadioButton hamburguer;
    JRadioButton bolo;
    ImageIcon pizzaIcon;
    ImageIcon hamburguerIcon;
    ImageIcon boloIcon;
    ButtonGroup grupo;

    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizza = new JRadioButton("Pizza");
        hamburguer = new JRadioButton("Hamburguer");
        bolo = new JRadioButton("Bolo");

        pizzaIcon = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\pizza.png");
        hamburguerIcon = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\hamburguer.png");
        boloIcon = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\bolo.png");

        pizza.addActionListener(this);
        hamburguer.addActionListener(this);
        bolo.addActionListener(this);

        pizza.setIcon(pizzaIcon);
        hamburguer.setIcon(hamburguerIcon);
        bolo.setIcon(boloIcon);

        grupo = new ButtonGroup();
        grupo.add(pizza);
        grupo.add(hamburguer);
        grupo.add(bolo);

        this.add(pizza);
        this.add(hamburguer);
        this.add(bolo);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == hamburguer) System.out.println("O cliente escolheu o hamburguer");
        if (e.getSource() == pizza) System.out.println("O cliente escolheu a pizza");
        if (e.getSource() == bolo) System.out.println("O cliente escolheu o bolo");

    }
}

