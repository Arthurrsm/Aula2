package br.newtonpaiva.dominio;

public class ContaEspecial extends Conta {
    private Double limite;

    @Override
    public Double sacar(Double valor){
        if (getSaldo() + limite < valor) {
            throw new IllegalStateException("Limite Indisponível");
            setSaldo(getSaldo() - valor);
            return getSaldo();
        }
        return valor;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
