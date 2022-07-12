package br.com.loja.dao.compra;

import br.com.loja.dao.BaseDaoImpl;
import br.com.loja.entidade.Compras;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class CompraDaoImpl extends BaseDaoImpl<Compras, Long> implements CompraDao {

    @Override
    public Compras pesquisarPorID(Long id, Session sessao) throws HibernateException {
        return sessao.get(Compras.class, id);
    }

}
