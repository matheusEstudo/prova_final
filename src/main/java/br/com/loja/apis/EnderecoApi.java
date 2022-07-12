package br.com.loja.apis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class EnderecoApi {

    private Integer cep;
    private String logradouro;
    private String uf;
    private String estado;
    private String endereco;

    public EnderecoApi(Integer cep, String logradouro, String uf, String estado, String endereco) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.uf = uf;
        this.estado = estado;
        this.endereco = endereco;
    }

}
