package Consultas;

public class Consulta {
    private String data;
    private String horario;
    private String duracao;
    private String status;
    private String paciente;
    private String medico;
    private String exames;
    private String medicamentos;
    private String valor;

    protected Consulta(String _data, String _horario, String _duracao, String _status,
                       String _paciente, String _medico, String _exames, String _medicamentos,
                       String _valor)
    {
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
}

