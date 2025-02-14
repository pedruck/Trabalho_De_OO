package menus;

import Consultas.Consulta;
import cadastros.CadastroConsultas;
import cadastros.CadastroMedico;
import cadastros.CadastroPaciente;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;

public class MenuConsultas {
    private static String data;
    private static String horario;
    private static String duracao;
    private static String paciente;
    private static String medico;
    private static String valor;
    private static String exames;
    private static String medicamentos;
    private boolean pagamentoRealizado = false;
    private static CadastroConsultas consulta;
    private static Paciente _paciente;

    private static CadastroConsultas GetConsulta()
    {
     if (consulta == null)
     {
         consulta = new CadastroConsultas();
     }
     return consulta;
    }


    public static void MenuDataConsulta() {
        String dialogo = "Informe a data da consulta:";
        data = JOptionPane.showInputDialog(dialogo);

            MenuHorarioConsulta();
    }

    public static void MenuHorarioConsulta(){
        String dialogo = "Informe o horário da consulta:";
        horario = JOptionPane.showInputDialog(dialogo);
        MenuDuracaoConsulta();
    }

    public static void MenuDuracaoConsulta(){
        String dialogo = "Informe a duração da consulta:";
        duracao = JOptionPane.showInputDialog(dialogo);
        MenuPacienteConsulta();
    }

    public static void MenuPacienteConsulta(){
        String dialogo = "Informe o cpf do paciente da consulta:";
        paciente = JOptionPane.showInputDialog(dialogo);
        MenuMedicoConsulta();
    }
    public static void MenuMedicoConsulta(){
        String dialogo = "Informe o cpf do medico da consulta:";
        paciente = JOptionPane.showInputDialog(dialogo);
        MenuValorConsulta();
    }
    public static void MenuValorConsulta(){
        String dialogo = "Informe o valor da consulta:";
        valor = JOptionPane.showInputDialog(dialogo);
        //ProximoMenu();
    }
    //Exames e medicamentos
}
