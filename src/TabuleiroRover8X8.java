import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TabuleiroRover8X8 {
    public static void main(String[] args) {
        List<Integer> movimentos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int jogada = 0;
        int posicao = 11;

        System.out.println("O robo Rover esta na posicao 11 da tabela. Ele so precisa andar duas casas para chegar na posicao 13 da tabela. De somente o comando que ele precise");

        while (jogada != 5) {
            System.out.print("Digite um comando: cima (1), baixo(2), esquerda(3), direita(4) ou sair(5): ");
            jogada = scanner.nextInt();
            if (jogada >= 1 && jogada <= 4) {
                movimentos.add(jogada);
            } else if (jogada < 1 || jogada > 5) {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
        for (int movimento : movimentos) {
            if (movimento == DirecaoEnum.CIMA.getValor()) {
                System.out.println("Movendo para cima.");
                posicao = mover(posicao, -8);
            } else if (movimento == DirecaoEnum.BAIXO.getValor()) {
                System.out.println("Movendo para baixo.");
                posicao = mover(posicao, 8);
            } else if (movimento == DirecaoEnum.ESQUERDA.getValor()) {
                System.out.println("Movendo para esquerda.");
                posicao = mover(posicao, -1);
            } else if (movimento == DirecaoEnum.DIREITA.getValor()) {
                System.out.println("Movendo para direita.");
                posicao = mover(posicao, 1);
            }
        }
        System.out.println("O Rover ficou na posição " + posicao);
        }



    public static int mover(int posicao, int movimento) {
        posicao += movimento;
        if (posicao < 0) {
            posicao = 0;
        } else if (posicao > 64) {
            posicao = 64;
        }
        return posicao;
    }
}
