package exemplo.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {
    private Connection conexao;

    public BancoDeDados() {
        conectar();
    }

    public void conectar() {
        try {
            String url = "jdbc:sqlite:projetoFinal.db";
            conexao = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }

    public void executarSQL(String sql) {
        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao executar SQL: " + e.getMessage());
        }
    }

    public ResultSet executarConsulta(String sql) {
        try {
            Statement stmt = conexao.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao executar consulta SQL: " + e.getMessage());
            return null;
        }
    }

    public void fecharConexao() {
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }
}
