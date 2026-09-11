import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> playlist = new ArrayList<>();

        playlist.add(" Evidencias ");
        playlist.add(" Telefone Mudo ");
        playlist.add(" Fio de Cabelo ");
        playlist.add(" Agenda Rabiscada ");
        playlist.add(" Boate Azul ");
        playlist.add(" Foto 3x4 ");
        playlist.add(" Pagina Virada ");

        for (String musica : playlist) {
            System.out.println("- " + musica);
        }
        System.out.println(" Quantidade de musicas na playlist " + playlist.size());

        System.out.println(" A musica na terceira posiçao: " + playlist.get(2));

        playlist.set(1, " O Sol");
        playlist.remove(5);

        for (String musica : playlist) {
            System.out.println("- " + musica);
        }

        if (playlist.contains(" Evidencias ")){
            System.out.println(" Contem a musica Evidencias ");
        }else{
            System.out.println(" Não contém a musica Evidencias na playlist ");
        }
    }
}