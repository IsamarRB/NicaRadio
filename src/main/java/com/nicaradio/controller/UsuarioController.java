package com.nicaradio.controller;


import com.nicaradio.model.Usuario;
import com.nicaradio.service.UsuarioService;
import org.springframework.http.MediaType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    @POST
    public void crearUsuario(Usuario usuario) {
        usuarioService.crearUsuario(usuario);
    }

    @GET
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }
}

