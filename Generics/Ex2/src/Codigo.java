public class Codigo {

    private String setor;
    private int numero;

    public Codigo( String setor, int numero){
        this.setor = setor;
        this.numero = numero;
    }

    public String getSetor() {
        return setor;
    }
    public int getNumero(){
        return numero;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return setor + " " + numero;
    }

}



