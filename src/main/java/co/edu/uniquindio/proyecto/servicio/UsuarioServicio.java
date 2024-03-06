package co.edu.uniquindio.proyecto.servicio;

import co.edu.uniquindio.proyecto.modelo.Usuario;
import co.edu.uniquindio.proyecto.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepository usuarioRepo;

    public List<Usuario> listarUsuarios(){
        return usuarioRepo.findAll();
    }

}
