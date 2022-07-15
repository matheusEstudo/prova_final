package br.com.loja.api.Endereco;

import br.com.loja.entidade.Endereco;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;

public class CepRest {

    private static Client client;
    private static WebResource webResource;

    public CepRest() {
        ClientConfig clientConfig = new DefaultClientConfig(GensonProvider.class);
        client = Client.create(clientConfig);
        //Utilizado para imprimir as operacoes no console
        client.addFilter(new LoggingFilter(System.out));
        webResource = client.resource("https://viacep.com.br/ws/");
    }

    public static Endereco pesquisaCep(String cep) {
        return webResource.path(cep).path("/json").get(Endereco.class);

    }

    public static void main(String... args) {
        CepRest notaREST = new CepRest();

        Endereco endereco = notaREST.pesquisaCep("88130-810");

        System.out.println("");
        System.out.println("Cep: " + endereco.getCep());
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("cidade: " + endereco.getBairro());
    }
}
