import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TabuleiroRover8X8 {
    public static void main(String[] args) {
        List<Integer> movimentos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int jogada = 0;
        int posicao = 11;
        int acerto = 13;


        System.out.println("O robo Rover esta na posicao 11 da tabela. Ele so precisa andar duas casas para chegar na posicao 13 da tabela. De somente o comando que ele precise");

        while (jogada != 5) {
            System.out.println("Escolha o movimento: direita (4), esquerda (3), baixo (2), cima (1), sair(5)");
            jogada = scanner.nextInt();
            if (jogada >= 1 && jogada <= 4) {
                movimentos.add(jogada);
            } else if (jogada < 1 || jogada < 5) {
                System.out.println("Jogada invalida!!! Tente novamnete");
            }
        }

        for (int movimento : movimentos) {
            if (movimento == DirecaoEnum.BAIXO.getValor()) {
                posicao = mover(posicao, +8);
                System.out.println("Movendo para baixo, sua posicao e "+ posicao);
            } else if (movimento == DirecaoEnum.CIMA.getValor()) {
                posicao = mover(posicao, -8);
                System.out.println("Movendo para cima, sua posicao e " + posicao);

            } else if (movimento == DirecaoEnum.ESQUERDA.getValor()) {
                posicao = mover(posicao, -1);
                System.out.println("Movendo para esquerda, sua posicao e " + posicao);

            } else if (movimento == DirecaoEnum.DIREITA.getValor()) {
                posicao = mover(posicao, +1);
                System.out.println("Movendo para a direita, sua posicao e " + posicao);
            } else if (movimento == DirecaoEnum.SAIR.getValor()){
                System.out.println("Sua posição é "+ posicao);
            }
        }


        if (posicao == acerto) {
            System.out.println("Parabens voce acertou, o Rover chegou na posicao " + posicao);
        } else {
            System.out.println("Voce errou a posicao " + posicao + " esta errada ele precisa chegar na posição 13 do tabuleiro.");
        }
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