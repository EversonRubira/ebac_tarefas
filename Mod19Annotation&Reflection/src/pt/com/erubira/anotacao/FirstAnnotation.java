package pt.com.erubira.anotacao;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface FirstAnnotation {


    String marca();

    String nome();

    int ano();
}
