package pizzaria.cadastroCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JTextField codigo, fone, nome, sobreNome, endereco, complemento, bairro, referencia;
    JLabel codigoLabel, foneLabel, nomeLabel, sobreNomeLabel, enderecoLabel, complementoLabel, bairroLabel, referenciaLabel;
    ImageIcon codigoIcon, foneIcon, nomeIcon, enderecoIcon;
    int limiteEsqueda=800, largura=200, altura=30;
    Frame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1360,765);
        this.setLayout(null);

        codigo = new JTextField();
        codigo.setBounds(limiteEsqueda,0,largura,altura);
        fone = new JTextField();
        fone.setBounds(limiteEsqueda,40,largura,altura);
        nome = new JTextField();
        nome.setBounds(limiteEsqueda,80,largura,altura);
        sobreNome = new JTextField();
        sobreNome.setBounds(limiteEsqueda,120,largura,altura);
        endereco = new JTextField();
        endereco.setBounds(limiteEsqueda,160,largura,altura);
        complemento = new JTextField();
        complemento.setBounds(limiteEsqueda,200,largura,altura);
        bairro = new JTextField();
        bairro.setBounds(limiteEsqueda,240,largura,altura);
        referencia = new JTextField();
        referencia.setBounds(limiteEsqueda,280,largura,altura);







        add(codigo);
        add(fone);
        add(nome);
        add(sobreNome);
        add(endereco);
        add(complemento);
        add(bairro);
        add(referencia);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
