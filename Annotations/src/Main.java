
public class Main {
    public static void main(String[] args) {

        Class<?> classe = MyClass.class;

       if (classe.isAnnotationPresent(Info.class)){
           Info info = classe.getAnnotation(Info.class);
           System.out.println(" Autor: " + info.autor());
           System.out.println(" Data: " + info.data());
       }







        }
    }
