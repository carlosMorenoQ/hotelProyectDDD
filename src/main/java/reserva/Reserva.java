package reserva;

import co.com.sofka.domain.generic.AggregateEvent;
import reserva.values.*;

import java.util.Set;

public class Reserva extends AggregateEvent<ReservaId> {

    protected Titular titular;
    protected FechaLLegada fechaLLegada;
    protected FechaSalida fechaSalida;
    protected CantidadPersonas cantidadPersonas;
    protected Set<Habitacion> habitaciones;
    protected TipoAcomodacion tipoAcomodacion;

    public Reserva(
            ReservaId reservaId,
            Titular titular,
            FechaLLegada fechaLLegada,
            FechaSalida fechaSalida,
            CantidadPersonas cantidadPersonas,
            Set<Habitacion> habitaciones,
            TipoAcomodacion tipoAcomodacion) {
        super(reservaId);
        this.titular = titular;
        this.fechaLLegada = fechaLLegada;
        this.fechaSalida = fechaSalida;
        this.cantidadPersonas = cantidadPersonas;
        this.habitaciones = habitaciones;
        this.tipoAcomodacion = tipoAcomodacion;
    }


    public Titular titular() {
        return titular;
    }

    public FechaLLegada fechaLLegada() {
        return fechaLLegada;
    }

    public FechaSalida fechaSalida() {
        return fechaSalida;
    }

    public CantidadPersonas cantidadPersonas() {
        return cantidadPersonas;
    }

    public Set<Habitacion> habitaciones() {
        return habitaciones;
    }

    public TipoAcomodacion tipoAcomodacion() {
        return tipoAcomodacion;
    }
}
