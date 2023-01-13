package projeto_curso_em_ingles.gridLayou;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*Layout Manager = Defines the natural layout for components within a container
         *
         * Grid Layout =     places components in a grid of cells.
         *                   Each component takes all te available space within its cell,
         *                   and each cell is the same size*/

        JFrame frame = new JFrame("Grid Layout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(10,12,10,10));// definindo o layout como grid e definindo a
        //                                                 quantidade de colunas e linhas e o gap entre as colunas e
        //                                                 linhas

        //caso exista mais componentes que o adeguado, será criado mais uma coluna
        for (Integer i = 1; i < 46; i++) {
            frame.add(new JButton("Suíte " + i.toString()));
        }


        frame.setVisible(true);


    }
}
