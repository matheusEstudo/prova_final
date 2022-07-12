package br.com.loja.dao.cliente;

import br.com.loja.dao.BaseDaoImpl;
import br.com.loja.entidade.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ClienteDaoImpl extends BaseDaoImpl<Cliente, Long> implements ClienteDao {

    @Override
    public Cliente pesquisarPorID(Long id, Session sessao) throws HibernateException {
        return sessao.get(Cliente.class, id);
    }

}
