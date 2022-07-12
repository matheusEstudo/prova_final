package br.com.loja.entidade;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "funcionario")
@PrimaryKeyJoinColumn(name = "id_usuario")
public class Funcionario extends Usuario {

    @OneToOne
    @JoinColumn(name = "id_compras")
    private Compras compras;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String matricula, String senha) {
        super(nome, cpf, matricula, senha);
    }

}
