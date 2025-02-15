package menus;

import Consultas.Consulta;
import cadastros.CadastroConsultas;
import cadastros.CadastroMedico;
import cadastros.CadastroPaciente;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Objects;

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
    private static Consulta consultaAtual;
    private static Paciente _paciente;



    private static CadastroConsultas GetCadastro()
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
        medico = JOptionPane.showInputDialog(dialogo);
        MenuValorConsulta();
    }
    public static void MenuValorConsulta(){
        String dialogo = "Informe o valor da consulta:";
        valor = JOptionPane.showInputDialog(dialogo);
        //consulta = new Consulta(data, horario, duracao, paciente, )

        //Cadastra a consulta em objeto (completa o codigo acima)  novo de tipo Consulta E completa as o JOPTIONDIALOG com oq falta tmj


        JOptionPane.showMessageDialog(new JFrame("Consulta Cadastrada!"),
                "Informações cadastradas da consulta:\n" +
                        "Data da consulta: " + data +"\n" +
                        "Horario da consulta: " + horario+"\n" +
                        "Duração da consulta: " + duracao+"\n" +
                        "Valor da consulta:" + valor);



        consultaAtual = new Consulta(data, horario, paciente, medico,"Agendada", BigDecimal.valueOf(Long.parseLong(valor)));
        GetCadastro().CadastrarConsulta(consultaAtual);
        MenuPrincipal.RunMenuPrincipal();
        //ProximoMenu();
    }











    //Exames e medicamentos
}
