package exemplo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TesteSemLetraBException {

    public static void verificarFrase(String frase) throws SemLetraBException {

        if (!frase.toLowerCase().contains("b")) {
            throw new SemLetraBException();
        }

    }

    public static void main(String[] args) throws SemLetraBException {

        try {
            verificarFrase(" A ala é de limão. ");
        } catch (SemLetraBException e) {
            System.out.println(e.getMessage());
        }
    }
}


