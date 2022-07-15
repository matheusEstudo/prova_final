package br.com.loja.entidade;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String logradouro;

    @Column
    private String cep;

    @Column
    private String bairro;

    @Column
    private String uf;

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(Long id, String logradouro, String cep, String bairro, String uf, Cliente cliente) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.uf = uf;
        this.cliente = cliente;
    }

}
