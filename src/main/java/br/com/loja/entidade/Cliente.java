package br.com.loja.entidade;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(name = "id_usuario")
public class Cliente extends Usuario {

    @OneToOne
    @JoinColumn(name = "id_compras")
    Compras compras;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String matricula, String senha) {
        super(nome, cpf, matricula, senha);
    }

}
