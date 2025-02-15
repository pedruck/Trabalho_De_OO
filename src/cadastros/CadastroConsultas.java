package cadastros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Consultas.Consulta;
import pessoas_fisicas.especificos.Medico;
import pessoas_fisicas.especificos.Paciente;

public class CadastroConsultas {

    private static List<Consulta> consultas;

    public CadastroConsultas()
    {
        consultas = new ArrayList<Consulta>();

    }

    public static void CadastrarConsulta (Consulta consulta) {
        {
            consultas.add(consulta);
        }
    }

    public static Consulta PesquisarMedico(String cpfMedico, String data, String horario) {
        for (Consulta m: consultas)
        {
            if (Objects.equals(m.getMedico(), cpfMedico) && Objects.equals(m.getData(), data) && Objects.equals(m.getHorario(), horario)) {
                return m;
            }
        }
        return null;
    }




}
