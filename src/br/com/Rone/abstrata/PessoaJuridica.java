package br.com.Rone.abstrata;

public class PessoaJuridica extends Pessoa{

    private Double cnpj;

    public Double getCnpj() {
        return cnpj;
    }

    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public Double cliente() {
        return cnpj;
    }
}
