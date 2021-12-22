package checkIn;

import checkIn.events.*;
import checkIn.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class CheckIn extends AggregateEvent<CheckInId> {

    protected FechaLLegada fechaLLegada;
    protected Set<Huesped> huespedes;
    protected ContratoHospedaje contratoHospedaje;
    protected Recepcionista recepcionista;
    protected LLaveHabitacion lLaveHabitacion;

    public CheckIn(CheckInId checkInId,
                   FechaLLegada fechaLLegada,
                   ContratoHospedaje contratoHospedaje,
                   Recepcionista recepcionista) {
        super(checkInId);
        appendChange(new CheckInCreado(fechaLLegada, contratoHospedaje, recepcionista)).apply();
    }

    private CheckIn(CheckInId checkInId) {
        super(checkInId);
        subscribe(new CheckInChange(this));
    }

    public void agregarHuesped(
            HuespedId huespedId,
            NombreHuesped nombreHuesped,
            ApellidoHuesped apellidoHuesped,
            EdadHuesped edadHuesped,
            NumeroHabitacionHuesped numeroHabitacionHuesped) {

        Objects.requireNonNull(huespedId);
        Objects.requireNonNull(nombreHuesped);
        Objects.requireNonNull(apellidoHuesped);
        Objects.requireNonNull(edadHuesped);
        Objects.requireNonNull(numeroHabitacionHuesped);

        appendChange(new HuespedAgregado(
                huespedId,
                nombreHuesped,
                apellidoHuesped,
                edadHuesped,
                numeroHabitacionHuesped)).apply();
    }

    public void asociarLLaveHabitacion(
            LLaveHabitacionId lLaveHabitacionId,
            NumeroHabitacionEnLLave numeroHabitacionEnLLave) {

        Objects.requireNonNull(lLaveHabitacionId);
        Objects.requireNonNull(numeroHabitacionEnLLave);

        appendChange(new LLaveHabitacionAsociada(
                lLaveHabitacionId,
                numeroHabitacionEnLLave
        )).apply();
    }

    public void modificarNumeroHabitacionEnLLave(
            LLaveHabitacionId lLaveHabitacionId,
            NumeroHabitacionEnLLave numeroHabitacionEnLLave){

        Objects.requireNonNull(lLaveHabitacionId);
        Objects.requireNonNull(numeroHabitacionEnLLave);

        appendChange(new NumeroHabitacionEnLLaveModificado(
                lLaveHabitacionId,
                numeroHabitacionEnLLave))
                .apply();
    }


    public void modificarNumeroHabitacionEnHuesped(
            HuespedId huespedId,
            NumeroHabitacionHuesped numeroHabitacionHuesped) {

        Objects.requireNonNull(huespedId);
        Objects.requireNonNull(numeroHabitacionHuesped);

        appendChange(new NumeroHabitacionHuespedModificado(
                huespedId,
                numeroHabitacionHuesped))
                .apply();

    }


    public Optional<Huesped> getHuespedPorId(HuespedId huespedId) {
        return huespedes()
                .stream()
                .filter(huesped -> huesped.identity().equals(huespedId))
                .findFirst();
    }


    public FechaLLegada fechaLLegada() {
        return fechaLLegada;
    }

    public Set<Huesped> huespedes() {
        return huespedes;
    }

    public ContratoHospedaje contratoHospedaje() {
        return contratoHospedaje;
    }

    public Recepcionista recepcionista() {
        return recepcionista;
    }

    public LLaveHabitacion llaveHabitacion() {
        return lLaveHabitacion;
    }


}
