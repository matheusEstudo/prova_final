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
    private String estado;

    @Column
    private String pais;

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(String logradouro, String cep, String estado, String pais) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.estado = estado;
        this.pais = pais;
    }

}
