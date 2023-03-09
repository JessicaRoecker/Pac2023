public enum DirecaoEnum {

    SAIR(5),
    DIREITA(4),
    ESQUERDA(3),
    BAIXO(2),
    CIMA(1);

    private final int valor;

    DirecaoEnum(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}