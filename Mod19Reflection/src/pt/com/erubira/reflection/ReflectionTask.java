package pt.com.erubira.reflection;

public class ReflectionTask {
    public static void main (String [] args) throws NoSuchMethodException {
        Class<ClassWithAnnotation> clazz = ClassWithAnnotation.class;

        if(clazz.isAnnotationPresent(FirsAnnotation.class))
    }
}
