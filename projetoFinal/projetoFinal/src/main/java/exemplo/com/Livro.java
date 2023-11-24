package exemplo.com;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Livro extends Item {
    private String autor;
    private String editora;
    private BancoDeDados bancoDeDados;

    public Livro() {
        bancoDeDados = new BancoDeDados();
    }

    @Override
    public void cadastrar() {
        String sql = "INSERT INTO livros (titulo, autor, editora) VALUES ('" + titulo + "', '" + autor + "', '"
                + editora + "')";
        bancoDeDados.executarSQL(sql);
    }

    @Override
    public void consultar() {
        String sql = "SELECT * FROM livros WHERE titulo = '" + titulo + "'";
        try (ResultSet rs = bancoDeDados.executarConsulta(sql)) {
            if (rs != null) {
                while (rs.next()) {
                    String titulo = rs.getString("titulo");
                    String autor = rs.getString("autor");
                    String editora = rs.getString("editora");
                    System.out.println("\n" + "Titulo:" + titulo + ", \n"+"Autor:" + autor + ", \n" + "Editora:"
                            + editora + "\n");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao processar consulta: " + e.getMessage());
        }
    }

    @Override
    public void atualizar() {
        String sql = "UPDATE livros SET autor = '" + autor + "', editora = '" + editora + "' WHERE titulo = '" + titulo
                + "'";
        bancoDeDados.executarSQL(sql);
    }

    @Override
    public void excluir() {
        String sql = "DELETE FROM livros WHERE titulo = '" + titulo + "'";
        bancoDeDados.executarSQL(sql);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public BancoDeDados getBancoDeDados() {
        return this.bancoDeDados;
    }

    public void setBancoDeDados(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

}
