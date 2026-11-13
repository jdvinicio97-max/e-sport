package ec.edu.puce.sport.model;

import java.time.LocalDate;

public record JugadorBasico(
        int codigo,
        String nombre,
        LocalDate fecha

) {
}
