package projeto_curso_em_ingles.optionPane;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "aaaaa", "título", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "aaaaa", "título", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "aaaaa", "título", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "aaaaa", "título", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "aaaaa", "título", JOptionPane.ERROR_MESSAGE);

        ImageIcon ney = new ImageIcon("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\projeto_curso_em_ingles\\src\\ney.jpg");

        String respostas[] = {"Ain parah", "NUM SOU GAY!!"};

        JOptionPane.showOptionDialog(null, "Tu é gay?", "Título", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ney, respostas, 0);

    }

}
