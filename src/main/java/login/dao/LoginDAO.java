package login.dao;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
    
    private static final Logger LOGGER = Logger.getLogger( LoginDAO.class.getName() );
    
    public void cadastroUsuario(String nome, String email, String senha, String d_nascimento) throws SQLException{
            Connection conexao = new Conexao().getConnection();
            String sql = "INSERT INTO usuario (nome, email, senha, d_nascimento) VALUES (?, ?, ?, ?)";
            System.out.print(sql);
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, senha);
            statement.setString(4, d_nascimento);
            statement.executeUpdate();
            conexao.close();             
    }

    public void loginUsuario (String email, String senha ) throws SQLException{
            Connection conexao = new Conexao().getConnection();
            String sql = "SELECT email, senha FROM usuario where email = ? AND senha = ? ";
            System.out.print(sql);
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, senha);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                System.out.println("Possui");
            }else{
                System.out.println("Não possui");
                
            }
            
            conexao.close();
    }
    
     

  
    
    public void Formulario(int id_usuario, int q1, int q2, int q3, int q4, int q5, int q6, int q7, int q8) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO formulario (id_usuario, q1, q2, q3, q4, q5, q6, q7, q8) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

           try {
        PreparedStatement statement = conexao.prepareStatement(sql);
        System.out.println("ID Usuário: " + id_usuario);

        // Adicione os valores ao PreparedStatement
        statement.setInt(1, id_usuario);
        statement.setInt(2, q1);
        statement.setInt(3, q2);
        statement.setInt(4, q3);
        statement.setInt(5, q4);
        statement.setInt(6, q5);
        statement.setInt(7, q6);
        statement.setInt(8, q7);
        statement.setInt(9, q8);

        // Execute o comando SQL
        int linhasAfetadas = statement.executeUpdate();

   

        LOGGER.info("Inserção bem-sucedida! Linhas afetadas: " + linhasAfetadas);
    } catch (SQLException e) {
        LOGGER.severe("Erro ao executar a instrução SQL: " + e.getMessage());
        e.printStackTrace();
    } finally {
        conexao.close();
    }
}
        

    

    public List<String> obterRespostas(int idUsuario) throws SQLException {
        Connection conexao = new Conexao().getConnection();
    String sql = "SELECT q1, q2, q3, q4, q5, q6, q7, q8 FROM formulario WHERE id_usuario = ?";
    List<String> respostas = new ArrayList<>();

    try (PreparedStatement statement = conexao.prepareStatement(sql)) {
        statement.setInt(1, idUsuario);

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                if (resultSet.getInt("q1") != 0) {
    respostas.add("Questão 1: " + resultSet.getString("q1"));
}
if (resultSet.getInt("q2") != 0) {
    respostas.add("Questão 2: " + resultSet.getString("q2"));
}
if (resultSet.getInt("q3") != 0) {
    respostas.add("Questão 3: " + resultSet.getString("q3"));
}
if (resultSet.getInt("q4") != 0) {
    respostas.add("Questão 4: " + resultSet.getString("q4"));
}
if (resultSet.getInt("q5") != 0) {
    respostas.add("Questão 5: " + resultSet.getString("q5"));
}
if (resultSet.getInt("q6") != 0) {
    respostas.add("Questão 6: " + resultSet.getString("q6"));
}
if (resultSet.getInt("q7") != 0) {
    respostas.add("Questão 7: " + resultSet.getString("q7"));
}
if (resultSet.getInt("q8") != 0) {
    respostas.add("Questão 8: " + resultSet.getString("q8"));
}
            
        }
    } finally {
        conexao.close();
    }

    return respostas;
}
}
}

    



       
        
    
 