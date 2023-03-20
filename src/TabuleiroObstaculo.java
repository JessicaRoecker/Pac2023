import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TabuleiroObstaculo {
    public static void main(String[] args) {
        List<Integer> movimentos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int jogada = 0;
        int posicao = 0;
        int obstaculo = 3;
        int acerto = 7;

        System.out.println("Vamos joga?\n O jogo está ficando mais empolgante!!!");
        System.out.println("Temos um obstaculo!!! Esta na casa 3 e você não pode passar por ali\n, precisa fazer o robo rover da a volta para chegar ate a casa 7");
        System.out.println("Lembrando que nosso tabuleiro se inicia na casa 0");

        while (jogada != 5) {
            System.out.println("Escolha os movimentos: direita (4), esquerda (3), baixo (2), cima (1), sair (5)");
            if (scanner.hasNextInt()) { // Verifica se o próximo token é um inteiro
                jogada = scanner.nextInt();
                if (jogada >= 1 && jogada <= 4) {
                    movimentos.add(jogada);
                } else if (jogada < 1 || jogada > 5) {
                    System.out.println("Jogada inválida!!! Tente novamente");
                }
            } else {
                String entrada = scanner.next(); // Lê a entrada como uma string para descartá-la
                System.out.println("Digite um número válido!");
            }
        }

        for (int movimento : movimentos) {
            if (movimento == DirecaoEnum.BAIXO.getValor()) {
                posicao = mover(posicao, +8);
                System.out.println("Movendo para Baixo, sua posição é " + posicao);
            } else if (movimento == DirecaoEnum.CIMA.getValor()) {
                posicao = mover(posicao, -8);
                System.out.println("Movendo para Cima, sua posição é " + posicao);
            } else if (movimento == DirecaoEnum.DIREITA.getValor()) {
                posicao = mover(posicao, +1);
                System.out.println("Movendo para Direita, sua posição é " + posicao);
            } else if (movimento == DirecaoEnum.ESQUERDA.getValor()) {
                posicao = mover(posicao, -1);
                System.out.println("Movendo para Esquerda, sua posição é " + posicao);
            } else if (movimento == DirecaoEnum.SAIR.getValor()) {
                System.out.println("Sua posicao é " + posicao);
            }
            if (posicao == obstaculo) {
                System.out.println("Você precisa desviar da casa 3!!!!");
                System.out.println("Tente Novamente!!!");
                break;

            }

        }
        if (posicao != obstaculo) {
            if (posicao == acerto) {
                System.out.println("Parabens!!! O rover chegou na posiça " + posicao);

            } else {
                System.out.println("Voce errou a posicao " + posicao + " esta errada ele precisa chegar na posicao 7 do tabuleiro.");
            }
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