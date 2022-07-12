package br.com.loja.dao.produtos;

import br.com.loja.dao.BaseDaoImpl;
import br.com.loja.entidade.Produto;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ProdutosDaoImpl extends BaseDaoImpl<Produto, Long> implements ProdutosDao {

    @Override
    public Produto pesquisarPorID(Long id, Session sessao) throws HibernateException {
        return sessao.get(Produto.class, id);
    }

}
