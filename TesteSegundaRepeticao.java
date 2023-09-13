import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteSegundaRepeticao {
    public static void main(String[] args) {
        int quantosAlunos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos"));

        int contator = 1;
        Scanner leitor = new Scanner(System.in);
        while (contator <= quantosAlunos) {

            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota"));
            double media;

            media = (nota1 + nota2) / 2;

            if (media >= 7) {

                JOptionPane.showMessageDialog(null, "Você foi aprovado com essa nota " + media);
            }else if (media == 4 || media <= 6){
                JOptionPane.showMessageDialog(null, "Vai para recuperação com essa nota " + media);
            } else {
                JOptionPane.showMessageDialog(null, "Você foi reprovado");
            }
            
            contator = contator + 1;

        }
        leitor.close();
    }
}
