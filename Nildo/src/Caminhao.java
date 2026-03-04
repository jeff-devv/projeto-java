public class Caminhao {

    private String nome;
    private double taxa;

    public Caminhao(String nome) {
        this.nome = nome;

        if (nome.equalsIgnoreCase("Ford Vermelho")) {
            this.taxa = 500;
        } else if (nome.equalsIgnoreCase("Mercedes Azul")) {
            this.taxa = 600;
        } else if (nome.equalsIgnoreCase("Volvo branco")) {
            this.taxa = 800;
        }
    }

    public double getTaxa() {
        return taxa;
    }
}
