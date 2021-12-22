package checkIn.comands;

import checkIn.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarHuesped extends Command {

    private final HuespedId huespedId;
    private final NombreHuesped nombreHuesped;
    private final ApellidoHuesped apellidoHuesped;
    private final EdadHuesped edadHuesped;
    private final NumeroHabitacionHuesped numeroHabitacionHuesped;

    public AgregarHuesped(
            HuespedId huespedId,
            NombreHuesped nombreHuesped,
            ApellidoHuesped apellidoHuesped,
            EdadHuesped edadHuesped,
            NumeroHabitacionHuesped numeroHabitacionHuesped) {
        this.huespedId = huespedId;
        this.nombreHuesped = nombreHuesped;
        this.apellidoHuesped = apellidoHuesped;
        this.edadHuesped = edadHuesped;
        this.numeroHabitacionHuesped = numeroHabitacionHuesped;
    }

    public HuespedId getHuespedId() {
        return huespedId;
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

}
