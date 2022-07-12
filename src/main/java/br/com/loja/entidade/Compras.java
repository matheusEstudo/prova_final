package br.com.loja.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "compras")
@Entity
public class Compras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "compras")
    private Cliente cliente;

    @OneToOne(mappedBy = "compras")
    private Funcionario funcionario;

    @OneToMany(mappedBy = "compras")
    private List<Produto> produtos;

    public Compras() {
    }

    public Compras(Cliente cliente, Funcionario funcionario, List<Produto> produtos) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produtos = produtos;
    }

}
