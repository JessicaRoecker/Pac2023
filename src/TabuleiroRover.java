import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class TabuleiroRover {
        public static void main(String[] args) {
            List<Integer> movimentos = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int jogada = 0;
            int posicao = 0;

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
                    posicao = mover(posicao, -4);
                } else if (movimento == DirecaoEnum.BAIXO.getValor()) {
                    System.out.println("Movendo para baixo.");
                    posicao = mover(posicao, 4);
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
            } else if (posicao > 15) {
                posicao = 15;
            }
            return posicao;
        }
    }


