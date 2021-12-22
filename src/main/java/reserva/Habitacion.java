package reserva;

import co.com.sofka.domain.generic.Entity;
import reserva.values.*;

import java.util.Objects;

public class Habitacion extends Entity<HabitacionId> {

    private Ubicacion ubicacion;
    private IsBloqueada isBloqueada;
    private TipoAcomodacion tipoAcomodacion;
    private Capacidad capacidad;

    public Habitacion(

            HabitacionId habitacionId,
            Ubicacion ubicacion,
            IsBloqueada isBloqueada,
            TipoAcomodacion tipoAcomodacion,
            Capacidad capacidad) {

        super(habitacionId);
        this.ubicacion = ubicacion;
        this.isBloqueada = isBloqueada;
        this.tipoAcomodacion = tipoAcomodacion;
        this.capacidad = capacidad;

    }


    public void modificarBloqueoHabitacion(IsBloqueada isBloqueada){
        this.isBloqueada = Objects.requireNonNull(isBloqueada);
    }

    public void modificarTipoHabitacion(TipoAcomodacion tipoAcomodacion){

        this.tipoAcomodacion = Objects.requireNonNull(tipoAcomodacion);

    }


    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public IsBloqueada isBloqueada() {
        return isBloqueada;
    }

    public TipoAcomodacion tipoAcomodacion() {
        return tipoAcomodacion;
    }

    public Capacidad capacidad() {
        return capacidad;
    }

}
