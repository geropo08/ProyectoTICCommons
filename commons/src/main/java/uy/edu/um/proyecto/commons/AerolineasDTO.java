package uy.edu.um.proyecto.commons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AerolineasDTO {
    private Long id;
    private String nombre;
    private String sedePrincipal;
    private String contacto;
    private String codigo;
    
}
