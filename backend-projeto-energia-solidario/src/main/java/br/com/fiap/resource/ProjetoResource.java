package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.beans.Projeto;
import br.com.fiap.bo.ProjetoBO;

@Path("/projetos")
public class ProjetoResource {
   
	private ProjetoBO bo;

    public ProjetoResource() throws ClassNotFoundException, SQLException {
        this.bo = new ProjetoBO();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response cadastrarProjeto(Projeto escola) throws ClassNotFoundException, SQLException {
        String resultado = bo.cadastrarProjeto(escola);
        return Response.ok(resultado).build();
    }

    @DELETE
    // @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response deletarProjeto(@PathParam("cod_proj") int cod_proj) throws ClassNotFoundException, SQLException {
        String resultado = bo.deletarProjeto(cod_proj);
        return Response.ok(resultado).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response atualizarProjeto(Projeto escola) throws ClassNotFoundException, SQLException {
        String resultado = bo.atualizarProjeto(escola);
        return Response.ok(resultado).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarTodosProjeto() throws ClassNotFoundException, SQLException {
        List<Projeto> lista = bo.listarTodosProjeto();
        return Response.ok(lista).build();
    }
}

