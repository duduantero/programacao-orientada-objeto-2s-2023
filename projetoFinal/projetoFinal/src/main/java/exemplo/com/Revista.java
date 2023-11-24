package exemplo.com;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Revista extends Item {
    private String edicao;
    private String periodicidade;
    private BancoDeDados bancoDeDados;

    public Revista() {
        bancoDeDados = new BancoDeDados();
    }

    @Override
    public void cadastrar() {
        String sql = "INSERT INTO revistas (titulo, edicao, periodicidade) VALUES ('" + titulo + "', '" + edicao
                + "', '" + periodicidade + "')";
        bancoDeDados.executarSQL(sql);
    }

    @Override
    public void consultar() {
        String sql = "SELECT * FROM revistas WHERE titulo = '" + titulo + "'";
        try (ResultSet rs = bancoDeDados.executarConsulta(sql)) {
            if (rs != null) {
                while (rs.next()) {
                    String titulo = rs.getString("titulo");
                    String edicao = rs.getString("edicao");
                    String periodicidade = rs.getString("periodicidade");
                    System.out.println("\n" + "Titulo:" + titulo + ", \n" + "Edicao:" + edicao + ", \n"
                            + "Periodicidade" + periodicidade + "\n");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao processar consulta: " + e.getMessage());
        }
    }

    @Override
    public void atualizar() {
        String sql = "UPDATE revistas SET edicao = '" + edicao + "', periodicidade = '" + periodicidade
                + "' WHERE titulo = '" + titulo + "'";
        bancoDeDados.executarSQL(sql);
    }

    @Override
    public void excluir() {
        String sql = "DELETE FROM revistas WHERE titulo = '" + titulo + "'";
        bancoDeDados.executarSQL(sql);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao() {
        return this.edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getPeriodicidade() {
        return this.periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public BancoDeDados getBancoDeDados() {
        return this.bancoDeDados;
    }

    public void setBancoDeDados(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

}
