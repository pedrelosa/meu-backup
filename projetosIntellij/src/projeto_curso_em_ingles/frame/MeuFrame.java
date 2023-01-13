package projeto_curso_em_ingles.frame;

import javax.swing.*;
import java.awt.*;

public class MeuFrame extends JFrame {

    MeuFrame(){
        this.setTitle("O título fica aqui");//definindo o título da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fexa a aplicação caso clique no xç
        // o defaut frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); que esconde
        this.setSize(420, 420);//definindo a dimensão do eixo x e eixo y
        this.setResizable(false);//define que a janela não pode ter o tamanho modificado
        this.setVisible(true);//deixando-o visivel

        ImageIcon logo = new ImageIcon("C:\\Users\\pedre\\Documents\\intellij\\projeto-intellij\\src\\projeto_curso_em_ingles\\src\\logo.jpg");//criando um objeto(icone) para a imagem
        this.setIconImage(logo.getImage());// mudando o icone do frame
        this.getContentPane().setBackground(new Color(0x3c0068));//mudando a cor do fundo pode ser com o Color."cor"
        //ou com o codigo hex 0xffffff
    }

}
