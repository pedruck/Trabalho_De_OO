package cadastros;

import pessoas_fisicas.especificos.Medico;
import pessoas_fisicas.especificos.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CadastroPaciente {

    private static List<Paciente> pacientes;

    public CadastroPaciente()
    {
        pacientes = new ArrayList<Paciente>();

    }

    public static Paciente PesquisarPaciente(String cpf)
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

    public static void AtualizarPaciente(Paciente paciente, String nome, String data_nascimento, String novocpf)
    {
            paciente.setData_nascimento(data_nascimento);
            paciente.setNome(nome);
            paciente.setCpf(novocpf);
    }


    public void CadastrarPaciente(Paciente _paciente)
    {
        Paciente resultado = PesquisarPaciente(_paciente.getCpf());

        if (resultado == null)
        {
            pacientes.add(_paciente);
        }
    }

//    public static void RemoverPaciente(Paciente _paciente)
//    {
//        pacientes.remove(_paciente);
//    }

    public static void RemoverPaciente(String cpf) {
        Paciente paciente = PesquisarPaciente(cpf);
        if (paciente != null) {
            pacientes.remove(paciente);
        }
    }


}
