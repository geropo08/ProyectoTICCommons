package uy.edu.um.proyecto.commons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuariosDTO {
    private String email;

    private String nombre;

    private String apellido;
    
    private String contrasena;

    private int permiso;

    private String rol;

    private String empresa;
    
}
