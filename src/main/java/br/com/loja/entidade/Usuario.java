package br.com.loja.entidade;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String nome;

    @Column(nullable = true)
    private String cpf;

    @Column(nullable = true)
    private String matricula;

    @Column(nullable = true)
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, String matricula, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.senha = senha;
    }

}
