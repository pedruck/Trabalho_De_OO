package Consultas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private String data;
    private String id;
    private String horario;
    private String paciente;
    private String medico;
    private String status;
    private float valor;
    private boolean pago;
    private List<Medicamento> prescricao;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isPago() {
        return pago;
    }

    public List<Medicamento> getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(List<Medicamento> prescricao) {
        this.prescricao = prescricao;
    }
}
