package projeto_curso_em_ingles.label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // JLabel = uma area de tela de GUI para textos, imagens, ou ambas

        ImageIcon gato = new ImageIcon("C:\\Users\\pedre\\Documents\\intellij\\projeto-intellij\\src\\projeto_curso_em_ingles\\src\\rapadura1.jpg");//defindo um ImageIcon para o .png gato

        Border border = BorderFactory.createLineBorder(Color.cyan, 3);

        JLabel label = new JLabel();// criando um label
        label.setText("Eae meu patrãum");// definindo texto da label || o texto pode ser definido: JLabel label = new JLabel("texto");
        label.setIcon(gato);
        label.setHorizontalTextPosition(SwingConstants.CENTER);// colocando o texto à esquerda, centro, ou direita da imagem
        label.setVerticalTextPosition(SwingConstants.BOTTOM);// colocando o texto em baixo, centro, ou cima da imgaem
        label.setForeground(new Color(0xe57922));//definindo a cor da fonte
        label.setFont(new Font("Impact", Font.BOLD, 32));// definindo a fonte, modo e tamanho
        label.setIconTextGap(10);//definindo a distancia em relação á imagem
        label.setBackground(Color.BLACK);// definindo o background da label
        label.setOpaque(true);// defindo que o label tem opacidade
        label.setBorder(border);
        label.setVerticalAlignment(SwingConstants.CENTER);// definindo o alinhamento do label
        label.setHorizontalAlignment(SwingConstants.CENTER);//definindo o alinhamento do label
        //label.setBounds(0,0,100,100);// definindo as dimessoes x e y e as dimenssões

        JFrame frame = new JFrame("Label");// criando o frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();//deixa o tamanho do frame do tamanho do labal !! tem que estar dps dos add() !!


    }


}
