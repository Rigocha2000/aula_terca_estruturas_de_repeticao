import java.util.Scanner;

public class TestePraAula {
public static void main(String[] args) {
    double nota1;
    double nota2;
    double media;

    int contador = 1;
    Scanner leitor = new Scanner(System.in);
    while (contador <= 3){
        System.out.println("Escreva a primeira nota");
        nota1 = leitor.nextDouble();

        System.out.println("Escreva a segunda nota");
        nota2 = leitor.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Você foi aprovado");
        }else if (media == 4 || media <=6) {
            System.out.println("Você vai para recuperação, estude mais");
        }else {
            System.out.println("Você foi reprovado");
        }
        contador = contador + 1;
    }
    leitor.close();  
}    
}
