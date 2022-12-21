package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    // Metódo responsável por estabelecer a conexão com o banco de dados...
    public static Connection conector() {
        Connection conexao = null;
        // A linha abaixo "chama" o driver...
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referente ao banco de dados...
        String url = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8";
        String user = "dba";
        String password = "Infox@123456";
        // Estabelecendo a conexão com o banco de dados...
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // A linha abaixo serve de apoio para esclarecer o erro...
            //System.out.println(e);
            return null;
        }
    }
}
