package checkIn;

import checkIn.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Huesped extends Entity<HuespedId> {

    private NombreHuesped nombreHuesped;
    private ApellidoHuesped apellidoHuesped;
    private EdadHuesped edadHuesped;
    private NumeroHabitacionHuesped numeroHabitacionHuesped;

    public Huesped(HuespedId huespedId,
                   NombreHuesped nombreHuesped,
                   ApellidoHuesped apellidoHuesped,
                   EdadHuesped edadHuesped,
                   NumeroHabitacionHuesped numeroHabitacionHuesped) {
        super(huespedId);
        this.nombreHuesped = Objects.requireNonNull(nombreHuesped);
        this.apellidoHuesped = Objects.requireNonNull(apellidoHuesped);
        this.edadHuesped = Objects.requireNonNull(edadHuesped);
        this.numeroHabitacionHuesped = Objects.requireNonNull(numeroHabitacionHuesped);
    }

    public void modificarNumeroHabitacionEnHuesped(NumeroHabitacionHuesped numeroHabitacionHuesped){
        this.numeroHabitacionHuesped = Objects.requireNonNull(numeroHabitacionHuesped);
    }

    public NombreHuesped nombreHuesped() {
        return nombreHuesped;
    }

    public ApellidoHuesped apellidoHuesped() {
        return apellidoHuesped;
    }

    public EdadHuesped edadHuesped() {
        return edadHuesped;
    }

    public NumeroHabitacionHuesped numeroHabitacionHuesped() {
        return numeroHabitacionHuesped;
    }

}
