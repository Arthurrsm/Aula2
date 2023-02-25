package br.newtonpaiva.dominio;

public class Conta {
    private Integer numero;
    private Double saldo;

    public Double sacar(Double valor) {
        return 0.0;
    }

    public Double depositar(Double valor) {
        if (valor == null || valor <= 0)
            throw new IllegalArgumentException("Por favor digite um valor inteiro, sendo maior de 0");
        else {
            saldo = saldo + valor;
            return saldo;
        }
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

