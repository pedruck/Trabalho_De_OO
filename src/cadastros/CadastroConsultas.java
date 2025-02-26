package cadastros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Consultas.Consulta;
import pessoas_fisicas.especificos.Medico;
import pessoas_fisicas.especificos.Paciente;

public class CadastroConsultas {

    private static List<Consulta> consultas;

    public CadastroConsultas() {
        consultas = new ArrayList<Consulta>();
    }

    private void GerarID (String cpfMedico, String cpfPacinte, String horario, Consulta consulta)
    {
        consulta.setId(cpfMedico + cpfPacinte + horario);
    }

    public void CadastrarConsulta(Consulta consulta, String cpfMedico, String cpfPacinte, String horario)
    {
        if (PesquisarConsulta(consulta.getId()) == null) {
            consultas.add(consulta);
            GerarID(cpfMedico, cpfPacinte, horario, consulta);
        }
    }

    public static Consulta PesquisarConsulta(String id)
    {

        for (Consulta c: consultas)
        {
            if (Objects.equals(c.getId(), id)) {
                return c;
            }
        }

        return null;
    }

    public static void RemoverConsulta(String id) {
        Consulta consulta = PesquisarConsulta(id);
        if (consulta != null) {
            consultas.remove(consulta);
        }
    }




}
