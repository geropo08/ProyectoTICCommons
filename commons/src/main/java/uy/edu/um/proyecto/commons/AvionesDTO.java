package uy.edu.um.proyecto.commons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AvionesDTO {
    private String matricula;

    private String modelo;
    private int cantidadPasajeros;
    private float capacidadCarga;
    private float distanciaDeDespegue;
    private float distanciaVuelo;
    private String empresa;
    
}
