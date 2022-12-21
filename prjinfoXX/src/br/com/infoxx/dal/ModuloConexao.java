package br.com.infoxx.dal;

import java.sql.*;

public class ModuloConexao {

    // Método responsavel por estabelecer a conexão com o banco de dados...
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // A linha abaixo "chama" o driver...
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referente ao banco de dados...
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // Estabelecendo a conexão com o banco de dados...
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // A linha abaixo serve de apoio para exclarecer o erro...
            //System.out.println(e);
            return null;
        }
    }
}
