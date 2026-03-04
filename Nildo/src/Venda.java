public class Venda {

    private Caminhao caminhao;
    private TipoPallet pallet;
    private int qtd;

    public Venda(Caminhao caminhao, TipoPallet pallet, int qtd) {
        this.caminhao = caminhao;
        this.pallet = pallet;
        this.qtd = qtd;
    }

    public double calcularCaixa(double entrada) {
        return entrada - caminhao.getTaxa();
    }

    public double calcularLucro() {
        return pallet.calcularLucro(qtd);
    }

    public int estoqueRestante() {
        return pallet.calcularEstoqueRestante(qtd);
    }
}