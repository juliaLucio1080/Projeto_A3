package login.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public Connection getConnection() throws SQLException{
      
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoa3", "root","");
        System.out.println("Conexão com o banco de dados estabelecida com sucesso."); 
        return conexao;
        
    }
}
   

    
        
    
     
    
       
        
        
    

