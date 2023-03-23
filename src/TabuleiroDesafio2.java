import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TabuleiroDesafio2 {
    public static void main(String[] args) {
        List<Integer> movimentos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int jogada = 0;
        int posicao = 11;
        int acerto = 27;

        System.out.println("Vamos la! O Rover esta na posicao 11 e precisa andar ate a posicao 27 ");
        System.out.println("Lembrando que ele esta em cima de uma matriz quadrada 8X8 e essa matriz comeca em 0 e vai ate 64");
        System.out.println("Ou seja a matriz comeca assim : 0 1 2  3  4  5  6  7 \n                         " +
                "       8 9 10 *11* 12 13 14 15 .... \n Lembre-se que o Rover esta saindo da posicao *11* ");
        System.out.println("E assim por diante, ate chegar no 64");


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
            }

            if (posicao == acerto) {
                System.out.println("Parabens!!! O rover chegou na posiça " + posicao);
            } else {
                System.out.println("Voce errou a posicao " + posicao + " esta errada ele precisa chegar na posicao 27 do tabuleiro." );
            }


    }
    public static int mover (int posicao, int movimento){
        posicao += movimento;
        if (posicao < 0){
            posicao = 0;
        } else if (posicao > 64) {
            posicao = 64;
        }
        return posicao;
    }
}











