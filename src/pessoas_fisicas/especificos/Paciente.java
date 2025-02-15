package pessoas_fisicas.especificos;

import pessoas_fisicas.Pessoa;

import java.util.List;
import java.util.Objects;

public class Paciente extends Pessoa
{
    private List<Objects> historico;

    public Paciente(String _nome, String _cpf, String _data_nascimento) {
        super(_nome, _cpf, _data_nascimento);
    }

    @Override
    public String exibirDetalhes() {
        return "Paciente: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nData de Nascimento: " + getData_nascimento();
    }
}
