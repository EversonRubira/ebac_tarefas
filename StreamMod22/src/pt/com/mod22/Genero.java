package pt.com.mod22;

import java.util.List;

public class Genero {

    private String id;
    private String nome;
    private String genero;
    private  int idade;

    public Genero() {

    }

    @Override
    public String toString() {
        return "Genero{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Genero(String id, String nome, String genero, int idade) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Genero> populaGeneros() {

        Genero genero1 = new Genero("g1", "Everson Rubira", "Masculino", 50);
        Genero genero2 = new Genero("g2", "Arthur Rubira", "Masculino", 8);
        Genero genero3 = new Genero("g3", "Claudia Teixeira", "Feminino", 42);
        Genero genero4 = new Genero("g4", "Andre Teixeira", "Masculino", 46);
        Genero genero5 = new Genero("g5", "Cimone Webber", "Feminino", 42);
        Genero genero6 = new Genero("g6", "Reni Rosa", "Feminino", 73);
        return List.of(genero1, genero2, genero3, genero4, genero5, genero6);
    }
}
