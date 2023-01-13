package cursoCod3r.equalsEHashcode;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;



    @Override
    public boolean equals(Object obj) {
        Usuario outro = (Usuario) obj;

        if (outro instanceof Usuario){
            boolean nomeIgual = Objects.equals(outro.nome, this.nome);
            boolean emailIgual = Objects.equals(outro.email, this.email);
            return nomeIgual && emailIgual;
        }else{
            return false;
        }




    }
}
