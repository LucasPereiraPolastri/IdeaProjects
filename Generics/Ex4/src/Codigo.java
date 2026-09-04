public class Codigo<T, U> {

    private T setor;
    private U numero;

    public Codigo( T setor, U numero){
        this.setor = setor;
        this.numero = numero;
    }

    public T getSetor() {
        return setor;
    }
    public U getNumero(){
        return numero;
    }

    public void setSetor(T setor){
        this.setor = setor;
    }

    public void setNumero(U numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return setor + "" + numero;

    }
}



