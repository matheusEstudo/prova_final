package br.com.loja.util;

public class GeradorUtil {

    public static String matricula(String tipo) {

        String numeros = "";

        for (int i = 0; i < 8; i++) {
            numeros += String.valueOf((int) (Math.random() * 10));
        }

        switch (tipo) {
            case "Cliente":
                return "C" + numeros;
            case "Funcionario":
                return "F" + numeros;
            default:
                return "cargo não existente";
        }
    }

    public static void main(String[] args) {
        System.out.println(matricula("Cliente"));
    }

}
