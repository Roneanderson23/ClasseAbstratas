package br.com.Rone.abstrata;

public class PessoaFisica extends Pessoa {

    private Double cpf;

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    @Override
    public Double cliente() {
        return cpf;
    }
}
