package br.com.loja.dao.cliente.funcionario;

import br.com.loja.dao.BaseDaoImpl;
import br.com.loja.entidade.Funcionario;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class FuncionarioDaoImpl extends BaseDaoImpl<Funcionario, Long> implements FuncionarioDao {

    @Override
    public Funcionario pesquisarPorID(Long id, Session sessao) throws HibernateException {
        return sessao.get(Funcionario.class, id);
    }

}
