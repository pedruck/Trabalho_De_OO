package cadastros.especificos;

import cadastros.Pessoa;
import java.util.List;
import java.util.Objects;

public class Medico extends Pessoa
{
    private int crm;
    private String especialidade;
    private List<Objects> historico;

    protected Medico(String _nome, String _cpf, String _data_nascimento) {
        super(_nome, _cpf, _data_nascimento);


    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
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

    //to do: deletar get e sets nao utilizados

    
}
