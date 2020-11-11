package br.com.projetoDAO.DAO;

import br.com.projetoDAO.conexao.conexao;
import br.com.projetoDAO.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PessoaDAO {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean consulta() {
        
        String sql = "select * from pessoa";

        con = conexao.conectar();
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.printf("%-5s|%-50s|%-20s\n", "Id", "Nome", "Profissao");
            while (rs.next()) {
                System.out.printf("%-5s|%-50s|%-20s\n", rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            return true;
        } catch (Exception e) {
            System.out.println("Não Foi Possivel Acessar Os Dados" + e);
            return false;
        } finally {
            conexao.desconectar(con);
        }

    }

    public boolean inserir(Pessoa p) {
        String sql = "insert into pessoa (nome,profissao) values (?,?);";

        con = conexao.conectar();
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, p.getNome());
            pst.setString(2, p.getProfissao());
            
            int r = pst.executeUpdate();
            if (r > 0) {
                System.out.printf("Dados Inseridos Com Sucesso");
            }
            return true;

        } catch (Exception e) {
            System.out.println("Não Foi Possivel Inserir Os Dados" + e);
            return false;
        } finally {
            conexao.desconectar(con);
        }
    }

    public boolean editar(Pessoa p) {
        String sql = "update pessoa set nome = ?, profissao = ? where id = ?";
        con = conexao.conectar();
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, p.getNome());
            pst.setString(2, p.getProfissao());
            pst.setInt(3, p.getId());
            int r = pst.executeUpdate();
            if (r > 0) {
                System.out.printf("Dados Atualizado Com Sucesso");
            }
            return true;

        } catch (Exception e) {
            System.out.println("Não Foi Possivel Atualizar Os Dados" + e);
            return false;
        } finally {
            conexao.desconectar(con);
        }
    }

    public boolean excluir(int id) {
        String sql = "delete from pessoa where id = ?";
        con = conexao.conectar();
        try {
            pst = con.prepareStatement(sql);            
            pst.setInt(1, id);
            pst.executeUpdate();
            
            return true;

        } catch (Exception e) {
            System.out.println("Não Foi Possivel Deletar Os Dados" + e);
            return false;
        } finally {
            conexao.desconectar(con);
        }
    }
    public boolean consultaporId(int id) {
        String sql = "Select * from pessoa where id = ?";

        con = conexao.conectar();

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            System.out.printf("%-5s|%-50s|%-20s\n", "ID", "Nome", "Profissao");
            while (rs.next()) {

                System.out.printf("%-5s|%-50s|%-20s\n", rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            return true;
        } catch (Exception e) {
            System.out.println("Não foi possível acessar os dados: " + e);
            return false;
        } finally {
            conexao.desconectar(con);
        }
    }
    
}
