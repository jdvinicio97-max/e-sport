package ec.edu.puce;

import ec.edu.puce.sport.model.Jugador;
import ec.edu.puce.sport.model.JugadorBasico;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;

@Path("/sport")
public class SportController {


    @GET
    public void saludar() {
        System.out.println("Hola!!");
    }

    @GET
    @Path("/process")
    public String procesar() {
        return "Procesando";
    }

    @GET
    @Path("/hello")
    public String saludo() {
        return "Hola como estas";
    }


    @GET
    @Path("/crear")
    public Response crearJugador() {

        Jugador jugador = new Jugador();

        jugador.setCodigo(1);
        jugador.setNombre("Eduardo");
        jugador.setFecha(LocalDate.of(1990, 10, 28));
        jugador.setEquipo("Desarrollo");

        IO.println(
                "El equipo %s esta conformado por los siguientes jugadores: %d - %s."
                        .formatted(
                                jugador.getEquipo(),
                                jugador.getCodigo(),
                                jugador.getNombre()
                        )
        );

        return Response.status(Response.Status.CREATED).entity(jugador).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearJugadorBasico(JugadorBasico jugador) {
        //JugadorBasico jugadorBasico = new JugadorBasico(2,"Diana", LocalDate.now());
        //IO.println("El jugador es: %s".formatted(...args:jugadorBasico.nombre()));
        IO.println("El jugador es: %s".formatted(jugador.nombre()));
        return Response.status(Response.Status.CREATED).entity(jugador).build();
    }
}
