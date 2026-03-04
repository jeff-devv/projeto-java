public class TipoPallet {

    private String nome;
    private int quantidade;
    private double valorVenda;
    private double valorCusto;

    public TipoPallet(String nome) {
        this.nome = nome;

        if (nome.equalsIgnoreCase("pbr")) {
            quantidade = 1000;
            valorVenda = 30;
            valorCusto = 20;
        } else if (nome.equalsIgnoreCase("Descartavel A")) {
            quantidade = 800;
            valorVenda = 25;
            valorCusto = 15;
        } else if (nome.equalsIgnoreCase("Descartavel B")) {
            quantidade = 2500;
            valorVenda = 30;
            valorCusto = 22;
        }
        // você adiciona os outros aqui
    }

    public int calcularEstoqueRestante(int qtdVendida) {
        return quantidade - qtdVendida;
    }

    public double calcularLucro(int qtdVendida) {
        return (valorVenda - valorCusto) * qtdVendida;
    }
}