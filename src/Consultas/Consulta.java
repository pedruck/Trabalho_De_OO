package Consultas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Consulta {
    private String data;
    private String horario;
    private String duracao;
    private String status;
    private String paciente;
    private String medico;
    private String valor;
    private String exames;
    private String medicamentos;
    private boolean pagamentoRealizado;


    public Consulta(String _data, String _horario, String _duracao, String _status,
                    String _paciente, String _medico, String _valor, String _exames, String _medicamentos) {
     data = _data;
     horario = _horario;
     duracao = _duracao;
     status = _status;
     paciente = _paciente;
     medico = _medico;
     exames = _exames;
     medicamentos = _medicamentos;
     valor = _valor;
    }

    public String getData() {return data;}

    public void setData(String data) {this.data = data;}

    public String getHorario() {return horario;}

    public void setHorario(String horario) {this.horario = horario;}

    public String getDuracao() {return duracao;}

    public void setDuracao(String duracao) {this.duracao = duracao;}

    public String getPaciente() {return paciente;}

    public void setPaciente(String paciente) {this.paciente = paciente;}

    public String getMedico() {return medico;}

    public void setMedico(String medico) {this.medico = medico;}

    public String getValor() {return valor;}

    public void setValor(String valor) {this.valor = valor;}

    public String getExames() {return exames;}

    public void setExames(String exames) {this.exames = exames;}

    public String getMedicamentos() {return medicamentos;}

    public void setMedicamentos(String medicamentos) {this.medicamentos = medicamentos;}

}



