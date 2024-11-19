package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


import br.com.fiap.beans.Projeto;
import br.com.fiap.dao.ProjetoDAO;


public class ProjetoBO {
	
    public String cadastrarProjeto(Projeto projeto) throws ClassNotFoundException, SQLException {
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.inserir(projeto);
    }

    public String deletarProjeto(int cod_proj) throws ClassNotFoundException, SQLException {
        ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.deletar(cod_proj);
    }

    public String atualizarProjeto(Projeto projeto) throws ClassNotFoundException, SQLException {
    	ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.atualizar(projeto);
    }

    public List<Projeto> listarTodosProjeto() throws ClassNotFoundException, SQLException {
    	ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.selecionar();
    }

    public Optional<Projeto> selecionarPorCod_proj(int cod_proj) throws ClassNotFoundException, SQLException {
    	ProjetoDAO projetoDAO = new ProjetoDAO();
        return projetoDAO.selecionarPorCod_proj(cod_proj);
    }
}
