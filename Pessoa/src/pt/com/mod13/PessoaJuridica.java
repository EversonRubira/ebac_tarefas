package pt.com.mod13;

public class PessoaJuridica extends Pessoa{

        private String cnpj;
        private int numeroColaboradores;
        private String ramoDeAtividade;

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        public int getNumeroColaboradores() {
            return numeroColaboradores;
        }

        public void setNumeroColaboradores(int numeroColaboradores) {
            this.numeroColaboradores = numeroColaboradores;
        }

        public String getRamoDeAtividade() {
            return ramoDeAtividade;
        }

        public void setRamoDeAtividade(String ramoDeAtividade) {
            this.ramoDeAtividade = ramoDeAtividade;
        }
    }

