package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Conta;
import br.newtonpaiva.dominio.pessoa.Pessoa;
import br.newtonpaiva.dominio.pessoa.PessoaFisica;
import br.newtonpaiva.dominio.pessoa.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
//        c.setNumero(10);
        c.setSaldo(100.0);

        c.depositar(50.0);

        Conta c2 = new Conta();
        c2.setNumero(90);
        c2.setSaldo(500.0);

        Conta c3 = new Conta();

        if(c == c2) {
            System.out.println("Mesma conta");
        }
        else {
            System.out.println("Contas diferentes");
        }
        System.out.println(c.getSaldo());

        // Pessoa p = new Pessoa();

        Pessoa pessoa[] = new Pessoa[4];
        pessoa[0] = new PessoaFisica();
        pessoa[1] = new PessoaJuridica();
        pessoa[2] = new PessoaJuridica();
        pessoa[3] = new PessoaFisica();

        for(Pessoa p : pessoa) //chama lista pessoa
            p.validarDocumento();

    }
}
