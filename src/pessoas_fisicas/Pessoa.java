package pessoas_fisicas;

public abstract class Pessoa
{

    private String nome;
    private String cpf;
    private String data_nascimento;

    protected Pessoa(String _nome, String _cpf, String _data_nascimento)
    {
        nome = _nome;
        cpf = _cpf;
        data_nascimento = _data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public abstract String exibirDetalhes();

}
