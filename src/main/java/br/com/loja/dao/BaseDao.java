package br.com.loja.dao;

import org.hibernate.*;

public interface BaseDao<T, ID> {

    void salvarOuAlterar(T entidade, Session sessao) throws HibernateException;

    void excluir(T entidade, Session sessao) throws HibernateException;

    T pesquisarPorID(ID id, Session sessao) throws HibernateException;
}
