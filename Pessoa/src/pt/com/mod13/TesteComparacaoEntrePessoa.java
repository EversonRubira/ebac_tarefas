package pt.com.mod13;

public class TesteComparacaoEntrePessoa {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Everson Rubira");
        pessoaFisica.setCpf("123.456.678-00");
        pessoaFisica.setGenero("Masc");
        pessoaFisica.setPaís("Portugal");
        pessoaFisica.setProfissao("Administrador");

        System.out.println("Esse sao dados ficticios de pessoa Fisica: " + "Nome: " + pessoaFisica.getNome() + " " + "CPF: " + pessoaFisica.getCpf() + " "
                + "Genero: " + pessoaFisica.getGenero() + " " + "Profissao: " + pessoaFisica.getProfissao());


        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Lego Brinquedos");
        pessoaJuridica.setCnpj("XX. XXX. XXX/0001-XX");
        pessoaJuridica.setEmail("legoBrinquedos@lego.com");
        pessoaJuridica.setPaís("Brasil");
        pessoaJuridica.setRamoDeAtividade("Criaçao e divertimento Infantil");

        System.out.println("Esse sao dados ficticios de pessoa juridica no Brasil: " + "Nome: " + pessoaJuridica.getNome() + " "
                + "CNPJ: " + pessoaJuridica.getCnpj() + " " + "E-mail: " + pessoaJuridica.getEmail() + " "
                + "Ramo de Atividade: " + pessoaJuridica.getRamoDeAtividade());

    }

}
