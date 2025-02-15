package pessoas_fisicas.especificos;

import pessoas_fisicas.Pessoa;
import java.util.List;
import java.util.Objects;

public class Medico extends Pessoa
{
    private String crm;
    private String especialidade;
    private List<Objects> historico;

    public Medico(String _nome, String _cpf, String _data_nascimento, String _crm, String _especialidade) {
        super(_nome, _cpf, _data_nascimento);
        this.crm = _crm;
        this.especialidade = _especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setHistorico(List<Objects> historico) {
        this.historico = historico;
    }

    public List<Objects> getHistorico() {
        return historico;
    }

    @Override
    public String exibirDetalhes() {
        return "Médico: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nData de Nascimento: " + getData_nascimento() +
                "\nCRM: " + crm +
                "\nEspecialidade: " + especialidade;
    }


}
