package checkIn.events;

import checkIn.Huesped;
import checkIn.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class HuespedAgregado extends DomainEvent {

    private final HuespedId huespedId;
    private final NombreHuesped nombreHuesped;
    private final ApellidoHuesped apellidoHuesped;
    private final EdadHuesped edadHuesped;
    private final NumeroHabitacionHuesped numeroHabitacionHuesped;



    public HuespedAgregado(
            HuespedId huespedId,
            NombreHuesped nombreHuesped,
            ApellidoHuesped apellidoHuesped,
            EdadHuesped edadHuesped,
            NumeroHabitacionHuesped numeroHabitacionHuesped) {
        super("hotel.checkIn.huespedAgregado");
        this.huespedId = huespedId;
        this.nombreHuesped = nombreHuesped;
        this.apellidoHuesped = apellidoHuesped;
        this.edadHuesped = edadHuesped;
        this.numeroHabitacionHuesped = numeroHabitacionHuesped;
    }

    public NombreHuesped getNombreHuesped() {
        return nombreHuesped;
    }

    public ApellidoHuesped getApellidoHuesped() {
        return apellidoHuesped;
    }

    public EdadHuesped getEdadHuesped() {
        return edadHuesped;
    }

    public NumeroHabitacionHuesped getNumeroHabitacionHuesped() {
        return numeroHabitacionHuesped;
    }

    public HuespedId getHuespedId() {
        return huespedId;
    }

}
