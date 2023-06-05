package pt.com.erubira.anotacao;


public class Main {
    public static void main(String [] args) {
        Class<ClassWithAnnotation> WithA = ClassWithAnnotation.class;

        FirstAnnotation annotation = WithA.getAnnotation(FirstAnnotation.class);

        if(annotation != null ) {
            String marca = annotation.marca();
            String nome = annotation.nome();
            System.out.println("Marca e Modelo do Carro é: " + marca + " - " + nome);
        }
    }
}
