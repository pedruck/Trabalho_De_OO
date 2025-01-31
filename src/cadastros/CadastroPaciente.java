package cadastros;

import pessoas_fisicas.especificos.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CadastroPaciente {

    private List<Paciente> pacientes;

    public CadastroPaciente()
    {
        pacientes = new ArrayList<Paciente>();

    }

    public Paciente PesquisarPaciente(String cpf)
    {
        for (Paciente p: pacientes)
        {
            if (Objects.equals(p.getCpf(), cpf))
            {
                return p;
            }

        }

        return null;
    }


    public void CadastrarPaciente(Paciente _paciente)
    {
        Paciente resultado = PesquisarPaciente(_paciente.getCpf());

        if (resultado == null)
        {
            pacientes.add(_paciente);
        }
    }

    public void RemoverPaciente(Paciente _paciente)
    {
        pacientes.remove(_paciente);
    }




}
