package br.com.loja.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabela {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja_pu");
        emf.close();
    }
}
