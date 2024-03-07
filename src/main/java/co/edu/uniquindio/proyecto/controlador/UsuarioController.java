package co.edu.uniquindio.proyecto.controlador;

import co.edu.uniquindio.proyecto.modelo.Usuario;
import co.edu.uniquindio.proyecto.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios(){
        return usuarioServicio.listarTodosUsuarios();
    }

    @PostMapping
    public Usuario crearUsuario(Usuario usuario){
        return usuarioServicio.crearUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(int id, Usuario usuario){
        return usuarioServicio.actualizarUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void borrarUsuario(int id){
        usuarioServicio.borrarUsuario(id);
    }
}
