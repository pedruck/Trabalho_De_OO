
package pessoas_fisicas.especificos;

import pessoas_fisicas.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paciente extends Pessoa
{
    private List<Objects> historico;
    private List<String> exameList = new ArrayList<>();
    boolean pagamento_pendente;
    float valor_a_ser_pago;

    public Paciente(String _nome, String _cpf, String _data_nascimento)
    {
        super(_nome, _cpf, _data_nascimento);
        pagamento_pendente = false;
        valor_a_ser_pago = 0;
    }

    @Override
    public String exibirDetalhes() {
        return "Paciente: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nData de Nascimento: " + getData_nascimento();
    }

    public void setPagamento_pendente(boolean pagamento_pendente) {
        this.pagamento_pendente = pagamento_pendente;
    }

    public boolean isPagamento_pendente() {
        return pagamento_pendente;
    }

    public void setValor_a_ser_pago(float valor_a_ser_pago) {
        this.valor_a_ser_pago = valor_a_ser_pago;
    }

    public float getValor_a_ser_pago() {
        return valor_a_ser_pago;
    }

    public void adicionarExame(String exame) {
        exameList.add(exame);
    }

    public List<String> getExames() {
        return exameList;
    }
}