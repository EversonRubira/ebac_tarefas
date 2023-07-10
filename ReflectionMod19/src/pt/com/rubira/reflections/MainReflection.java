package pt.com.rubira.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {

    public static void main(String[] args) {

        Class clazz = Colaborador.class;
            System.out.println(clazz);

        Colaborador colab = new Colaborador();
        Class clazz1 = colab.getClass();
            System.out.println(clazz1);

        try {
            Constructor cons = clazz.getConstructor();
            Colaborador colab1 = (Colaborador) cons.newInstance();
                System.out.println(cons);
                System.out.println(colab1);

            Field[] fileds = colab1.getClass().getDeclaredFields();
            for(Field field : fileds) {
                Class<?> type = field.getType();
                String nome = field.getName();
                   System.out.println(type);
                   System.out.println(nome);
            }

            Method[] methods = colab1.getClass().getDeclaredMethods();
            for(Method m : methods) {
                Class<?> type = m.getReturnType();
                String nome = m.getName();
                System.out.println(type);
                System.out.println(nome);
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}