package uy.edu.um.proyecto.commons;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VuelosDTO {

    private Long number;
    private String codigoVuelo;
    private String matricula;
    private String aereopuertoSalida;
    private String aeropuertoLlegada;
    private Boolean estadoAceptacionSalida;
    private Boolean estadoAceptacionLlegada;
    private String estadoVuelo;
    private LocalDate fechaSalida;
    private String horaSalida;
    private LocalDate fechaLlegada;
    private String horaLlegada;
    private String licenciaPiloto;
    
}
