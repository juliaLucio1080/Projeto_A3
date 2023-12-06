
package login.controller;

import com.mycompany.projeto_a3.Cadastrar;
import com.mycompany.projeto_a3.Questão_1;
import com.mycompany.projeto_a3.Tela_de_Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import login.dao.Conexao;
import login.dao.LoginDAO;

/**
 *
 * @author Cinthia
 */
public class LoginController {
    
    private int idUsuarioLogado = -1; // Valor padrão indicando que nenhum usuário está logado
    private final LoginDAO loginDAO = new LoginDAO();
    
    public void cadastroUsuario(Cadastrar view) throws SQLException {
        
            Connection conexao = new Conexao().getConnection();
            LoginDAO cadastro = new LoginDAO();
            cadastro.cadastroUsuario(view.getTxt_nome().getText(), view.getTxt_email().getText(), view.getTxt_senha().getText(), view.getTxt_data().getText());
      
           
    }

        public boolean loginUsuario(Tela_de_Login view) throws SQLException {
            
            String email = view.getTxt_login().getText();
            String senha = new String(view.getTxt_senha().getPassword());
       
            Connection conexao = new Conexao().getConnection();
           
            try {
            // Consultar o banco de dados para verificar o usuário
            boolean usuarioAutenticado = verificarCredenciais(email, senha);

            if (usuarioAutenticado) {
                System.out.println("Login bem-sucedido");
                JOptionPane.showMessageDialog(view, "Login efetuado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                int idUsuario = obterIdUsuario(email);
                
                setIdUsuarioLogado(idUsuario);
                
                Questão_1 questao1 = new Questão_1(idUsuario);
                questao1.setVisible(true);

                System.out.println("ID do usuário após o login: " + idUsuario);
            
         
                
                return true;
            } else {
                System.out.println("Credenciais inválidas");
                // Exibir mensagem de erro para o usuário
                JOptionPane.showMessageDialog(view, "Usuario ou senha invalidos", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            // Lidar com exceções de banco de dados
            
            JOptionPane.showMessageDialog(view, "Erro ao acessar o banco de dados", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }finally{
                conexao.close();
            
        }
    }

    // Método privado para verificar as credenciais no banco de dados
    private boolean verificarCredenciais(String email, String senha) throws SQLException {
        
        String sql = "SELECT COUNT(*) FROM usuario WHERE email = ? AND senha = ?";
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement statement = conexao.prepareStatement(sql)) {

            statement.setString(1, email);
            statement.setString(2, senha);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0; // Se houver pelo menos um usuário com essas credenciais, retorna true
                }
            }
        }

        return false;
    }
    
    private int obterIdUsuario(String email) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT id_usuario FROM usuario WHERE email = ?";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("id_usuario");
                }
            }
        }

        return -1;
    }
    
     private void setIdUsuarioLogado(int idUsuario) {
        this.idUsuarioLogado = idUsuario;
    }

    /**
     * Método público para obter o ID do usuário logado.
     * @return O ID do usuário logado ou -1 se nenhum usuário está logado.
     */
    public int obterIdUsuarioLogado() {
        return idUsuarioLogado;
    }

 public List<String> obterRespostas(int idUsuario) throws SQLException {
        return loginDAO.obterRespostas(idUsuario);
    }
       
    private boolean respostaEnviada = false;    
    public void respostaFormulario(int id_usuario, int q1, int q2, int q3, int q4, int q5, int q6, int q7, int q8) throws SQLException {
                try {
            loginDAO.Formulario(id_usuario, q1, q2, q3, q4, q5, q6, q7, q8);
        } catch (SQLException e) {
          
            e.printStackTrace();
        }
    }

 
}
