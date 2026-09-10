import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String cpf;
    @IdadeMinima(valor=18)
    private LocalDate dataNascimento;

    public Usuario(String nome, String cpf, LocalDate dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }




}
