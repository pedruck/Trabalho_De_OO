public class Medicamento {
    private String nome;
    private String dosagem;
    private int quantidade;
    private String instrucoes;

    public Medicamento(String nome, String dosagem, int quantidade, String instrucoes) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.quantidade = quantidade;
        this.instrucoes = instrucoes;
    }

    public String getNome() {
        return nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    // Método para exibir informações sobre o medicamento
    public void exibirInformacoes() {
        System.out.println("Medicamento: " + nome);
        System.out.println("Dosagem: " + dosagem);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Instruções: " + instrucoes);
        System.out.println("-----------------------------");
    }
}
