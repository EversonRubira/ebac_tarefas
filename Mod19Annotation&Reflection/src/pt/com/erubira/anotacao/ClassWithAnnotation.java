package pt.com.erubira.anotacao;

@FirstAnnotation(marca = "KIA", nome = "XCeed", ano = 2023)
public class ClassWithAnnotation {


    @FirstAnnotation(marca = "Renault", nome = "Captur", ano = 2019)
    public void methodWithAnnotation() {
    }

    @FirstAnnotation(marca = "Peugeot", nome = "5008", ano = 2022)
    public ClassWithAnnotation() {
    }

}
