
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrilhoRover {
    public static void main(String[] args) {
        List<Integer> movimentos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int jogador = 0;
        int posicao = 0;

        System.out.println("Escolha as posições que deseja andar: ");

        while (jogador != 5) {
            System.out.println("Qual direção iremos? Esqueda(0) Direita(1) Sair(5)");
            jogador = scan.nextInt();
            if (jogador != 5) {
                movimentos.add(jogador);
            }
        }

        for (int movimento : movimentos) {
            if (movimento == 1) {
                posicao++;
            } else if (movimento == 0) {
                posicao--;
            }
        }

        System.out.println("A posição que frederaldo ficou foi a: " + posicao);
    }
}
