package br.com.Rone.abstrata;

public class Programa {

    //Estancia classe Pessoa
    public static void main(String args[]){
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("José");
        pessoaFisica.setSobrenome(" da Silva ");
        pessoaFisica.setCpf(123456d);
        imprimir(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("João");
        pessoaJuridica.setSobrenome(" do Santos ");
        pessoaJuridica.setCnpj(1234567d);
        imprimir(pessoaJuridica);
    }

    public static void imprimir(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome() + pessoa.getSobrenome() + "CNPJ ou CPF: " + pessoa.cliente());
    }
}
