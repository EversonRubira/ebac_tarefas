package pt.com.erubira.anotacao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TaskReflection {
    public static void main (String [] args) throws NoSuchMethodException {
        Class<ClassWithAnnotation> clazz = ClassWithAnnotation.class;

        if(clazz.isAnnotationPresent(FirstAnnotation.class)) {
            FirstAnnotation annotation = clazz.getAnnotation(FirstAnnotation.class);
            String marca = annotation.marca();
            String nome = annotation.nome();
            int ano = annotation.ano();

           System.out.println("Anotacao por classe:" );
           System.out.println("Marca: " + marca);
           System.out.println("Nome: " + nome);
           System.out.println("Ano: " + ano);
            System.out.println("--------------");
        }

        Method method = clazz.getMethod("methodWithAnnotation");
        if(method.isAnnotationPresent(FirstAnnotation.class)) {
            FirstAnnotation annotation = method.getAnnotation(FirstAnnotation.class);
            String marca = annotation.marca();
            String nome = annotation.nome();
            int ano = annotation.ano();

            System.out.println("Anotacao por metodo:" );
            System.out.println("Marca: " + marca);
            System.out.println("Nome: " + nome);
            System.out.println("Ano: " + ano);
            System.out.println("--------------");
        }
        Constructor<ClassWithAnnotation> constructor = clazz.getConstructor();
        if (constructor.isAnnotationPresent(FirstAnnotation.class)) {
            FirstAnnotation annotation = constructor.getAnnotation(FirstAnnotation.class);
            String marca = annotation.marca();
            String nome = annotation.nome();
            int ano = annotation.ano();

            System.out.println("Anotacao por nivel de Construtor:" );
            System.out.println("Marca: " + marca);
            System.out.println("Nome: " + nome);
            System.out.println("Ano: " + ano);
            System.out.println("--------------");

        }
    }
}
