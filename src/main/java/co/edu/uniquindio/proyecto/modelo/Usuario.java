package co.edu.uniquindio.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Usuario implements Serializable {

    @Id
    private int id;
    private String nombre;
    private String apeliido;
    private int edad;
    private String correo;
}
