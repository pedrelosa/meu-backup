package projeto_curso_em_ingles.frame;

public class Main {

    public static void main(String[] args) {
        // JFrame = uma janela de GUI para adicionar componentes

        /*JFrame frame = new JFrame();//criando um frame
        frame.setTitle("O título fica aqui");//definindo o título da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fexa a aplicação caso clique no x
        // o defaut frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); que esconde
        frame.setSize(420, 420);//definindo a dimensão do eixo x e eixo y
        frame.setResizable(false);//define que a janela não pode ter o tamanho modificado
        frame.setVisible(true);//deixando-o visivel

        ImageIcon logo = new ImageIcon("C:\\Users\\pedre\\Documents\\intellij\\projeto-intellij\\src\\projeto_criando_frame\\logo.jpg");//criando um objeto(icone) para a imagem
        frame.setIconImage(logo.getImage());// mudando o icone do frame
        frame.getContentPane().setBackground(new Color(0x562f7e));//mudando a cor do fundo pode ser com o Color."cor"
        //ou com o codigo hex 0xffffff*/

        MeuFrame meuFrame = new MeuFrame();
        // ou usar apenas "new MeuFrame();" se não for utilizar o nome meuFrame



    }


}
