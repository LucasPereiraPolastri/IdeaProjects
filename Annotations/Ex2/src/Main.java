
public class Main {
    public static void main(String[] args) {

        Class<?> classe = TesteVersion.class;



        if (classe.isAnnotationPresent(Version.class)) {
            Version versao = classe.getAnnotation(Version.class);


            System.out.println(versao.description() + " " + versao.number());


        }
    }
}
