package com.mycompany.projeto_a3;

import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.List;
import login.controller.LoginController;

public class RespostasUsuario extends javax.swing.JFrame {
    
    private LoginController loginController;
    private int id_Usuario;

    public RespostasUsuario(int idUsuario) throws SQLException {
        initComponents();
        this.id_Usuario = idUsuario;

        try {
            this.loginController = new LoginController(); // Inicialize aqui
            exibirRespostas();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao inicializar o controlador de login.");
        }
    }

    private void exibirRespostas() throws SQLException {
        List<String> respostas = loginController.obterRespostas(id_Usuario);

    if (respostas.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Não foram encontradas respostas para este usuário.");
    } else {
        StringBuilder mensagem = new StringBuilder("<html><body><h1>Respostas do Usuário:</h1>");
        int questaoIndex = 1;

        for (String resposta : respostas) {
            // Dividir a string para obter apenas o valor da resposta
            String[] partes = resposta.split(": ");
            
            if (partes.length == 2) {
                int valorResposta = Integer.parseInt(partes[1]);

                if (valorResposta != 0) {
                    mensagem.append("<p>Questão ").append(questaoIndex).append(": ").append(valorResposta).append("</p>");
                }

                questaoIndex++;
            }
        }

        mensagem.append("</body></html>");

        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");
        textPane.setText(mensagem.toString());
        textPane.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textPane);

        JOptionPane.showMessageDialog(this, scrollPane, "Respostas do Usuário", JOptionPane.INFORMATION_MESSAGE);
    }
}
    private void initComponents() {
        
    }
}