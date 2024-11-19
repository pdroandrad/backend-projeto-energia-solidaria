package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.fiap.beans.Projeto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProjetoDAO {

	public Connection minhaConexao;

	public ProjetoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	// Insert
	public String inserir(Projeto projeto) throws SQLException {
        String sql = "INSERT INTO PROJETO (cod_proj, nome, descricao, valor) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        stmt.setInt(1, projeto.getCod_proj());
        stmt.setString(2, projeto.getNome());
        stmt.setString(3, projeto.getDescricao());
        stmt.setDouble(4, projeto.getValor());
        stmt.execute();
        stmt.close();
        return "Cadastrado com Sucesso!";
    }

	// Delete
	public String deletar(int cod_proj) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from PROJETO where cod_proj = ?");
		stmt.setInt(1, cod_proj);
		stmt.execute();
		stmt.close();
		return "Deletado com Sucesso!";
	}

	// Update
	public String atualizar(Projeto projeto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				" Update PROJETO set COD_PROJETO = ?, NOME = ?,  VALOR = ?, DESCRICAO = ? where COD_PROJ = ?");
		stmt.setInt(1, projeto.getCod_proj());
		stmt.setString(2, projeto.getNome());
		stmt.setString(3, projeto.getDescricao());
		stmt.setDouble(4, projeto.getValor());
		stmt.executeUpdate();
		stmt.close();
		return "Atualizado com Sucesso!";
	}

	// Select
	public List<Projeto> selecionar() throws SQLException {
		List<Projeto> listaProjeto = new ArrayList<Projeto>();
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM PROJETO");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Projeto projeto = new Projeto();
			projeto.setCod_proj(rs.getInt(1));
			projeto.setNome(rs.getString(2));
			projeto.setDescricao(rs.getString(3));
			projeto.setValor(rs.getDouble(4));
			listaProjeto.add(projeto);
		}
		return listaProjeto;
	}

	public Optional<Projeto> selecionarPorCod_proj(int cod_proj) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM PROJETO WHERE COD_PROJ = ?");
		stmt.setInt(1, cod_proj);
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			Projeto projeto = new Projeto();
			projeto.setCod_proj(rs.getInt("COD_PROJETO"));
			projeto.setNome(rs.getString("NOME"));
			projeto.setDescricao(rs.getString("DESCRICAO"));
			projeto.setValor(rs.getDouble("VALOR"));
			return Optional.of(projeto);
		}

		return Optional.empty();
	}
}
	
