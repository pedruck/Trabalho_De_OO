package cadastros;

import pessoas_fisicas.especificos.Medico;
import pessoas_fisicas.especificos.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CadastroMedico {

    private static List<Medico> medicos;

    public CadastroMedico() {
        medicos = new ArrayList<Medico>();
    }

    public static Medico PesquisarMedico(String cpf) {
        for (Medico m: medicos) {
            if (Objects.equals(m.getCpf(), cpf)) {
                return m;
            }
        }
        return null;
    }

    public static void AtualizarMedico(Medico medico, String nome, String data_nascimento, String novocpf)
    {
        medico.setData_nascimento(data_nascimento);
        medico.setNome(nome);
        medico.setCpf(novocpf);
    }

    public void CadastrarMedico(Medico medico) {
        if (PesquisarMedico(medico.getCpf()) == null) {
            medicos.add(medico);
        }
    }

    public static void RemoverMedico(String cpf) {
        Medico medico = PesquisarMedico(cpf);
        if (medico != null) {
            medicos.remove(medico);
        }
    }

}
