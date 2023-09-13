import java.util.Scanner;

public class TestePraAula {
    public static void main(String[] args) {
        int numeroAlunos, contador;
        double nota, nota2;
        double media;

        int contador =1;
        Scanner leitor = new Scanner(System.in);
        while (contador <=3){

            System.out.println("Escreva sua primeira nota");
            nota = leitor.nextDouble();

            System.out.println("Escreva sua segunda nota");
            nota2 = leitor.nextDouble();

            media = (nota + nota2) / 2;
            contador = contador +1;


        }
        leitor.close();
    }
    
}
