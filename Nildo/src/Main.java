import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Caminhão:");
        Caminhao caminhao = new Caminhao(sc.nextLine());

        System.out.println("Tipo pallet:");
        TipoPallet pallet = new TipoPallet(sc.nextLine());

        System.out.println("Quantidade:");
        int qtd = sc.nextInt();

        Venda venda = new Venda(caminhao, pallet, qtd);

        System.out.println("Caixa: " + venda.calcularCaixa(2000));
        System.out.println("Lucro: " + venda.calcularLucro());
        System.out.println("Estoque restante: " + venda.estoqueRestante());
    }
}