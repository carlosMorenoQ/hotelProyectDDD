package reserva;

import checkOut.values.FechaSalida;
import co.com.sofka.domain.generic.AggregateEvent;
import reserva.events.BloqueoHabitacionModificado;
import reserva.events.DowngradeRealizado;
import reserva.events.MedioDePagoModificado;
import reserva.events.UpgradeRealizado;
import reserva.values.*;

import java.util.Objects;
import java.util.Optional;
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

    public Reserva(ReservaId reservaId) {
        super(reservaId);
        subscribe(new ReservaChange(this));
    }

    public void realizarUpgrade(
            HabitacionId habitacionId,
            TipoAcomodacion tipoAcomodacion) {

        Objects.requireNonNull(habitacionId);
        Objects.requireNonNull(tipoAcomodacion);
        appendChange(new UpgradeRealizado(habitacionId, tipoAcomodacion)).apply();
    }

    public void realizarDowngrade(
            HabitacionId habitacionId,
            TipoAcomodacion tipoAcomodacion) {

        Objects.requireNonNull(habitacionId);
        Objects.requireNonNull(tipoAcomodacion);
        appendChange(new DowngradeRealizado(habitacionId, tipoAcomodacion)).apply();
    }

    public void modificarBloqueoHabitacion(
            HabitacionId habitacionId,
            IsBloqueada isBloqueada) {

        Objects.requireNonNull(habitacionId);
        Objects.requireNonNull(isBloqueada);

        appendChange(new BloqueoHabitacionModificado(
                habitacionId,
                isBloqueada
        )).apply();
    }

    public void modificarMedioDePago(
            TitularId titularId,
            MedioDePago medioDePago) {

        Objects.requireNonNull(titularId);
        Objects.requireNonNull(medioDePago);

        appendChange(new MedioDePagoModificado(
                titularId,
                medioDePago
        )).apply();

    }


    public Optional<Habitacion> getHabitacionPorId(HabitacionId habitacionId) {
        return habitaciones()
                .stream()
                .filter(habitacion -> habitacion.identity().equals(habitacionId))
                .findFirst();
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
