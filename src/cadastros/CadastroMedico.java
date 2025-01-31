package cadastros;

import pessoas_fisicas.especificos.Medico;
import pessoas_fisicas.especificos.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CadastroMedico {

    private List<Medico> medicos;

    public CadastroMedico() {
        medicos = new ArrayList<Medico>();
    }

    public Medico PesquisarMedico(String cpf) {
        for (Medico m: medicos) {
            if (Objects.equals(m.getCpf(), cpf)) {
                return m;
            }
        }
        return null;
    }

    public void CadastrarMedico(Medico medico) {
        if (PesquisarMedico(medico.getCpf()) == null) {
            medicos.add(medico);
        }
    }

    public void RemoverMedico(Medico medico) {
        medicos.remove(medico);
    } //fiz igual o do CadastroPaciente, mas acho que a gente devia fazer o remove por cpf (exemplo de baixo)

    /*public void RemoverMedico(String cpf) {
        Medico medico = PesquisarMedico(cpf);
        if (medico != null) {
            medicos.remove(medico);
        }
    }*/

}
