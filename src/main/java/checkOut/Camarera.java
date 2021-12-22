package checkOut;

import checkOut.values.Apellidos;
import checkOut.values.CamareraId;
import checkOut.values.HabitacionParaLimpieza;
import checkOut.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Camarera extends Entity<CamareraId> {

    private Nombre nombre;
    private Apellidos apellidos;
    private HabitacionParaLimpieza habitacionParaLimpieza;

    public Camarera(
            CamareraId camaraId,
            Nombre nombre,
            Apellidos apellidos,
            HabitacionParaLimpieza habitacionParaLimpieza) {
        super(camaraId);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.habitacionParaLimpieza = habitacionParaLimpieza;
    }

    public void asignarHabitacionParaLimpieza(HabitacionParaLimpieza habitacionParaLimpieza){
        this.habitacionParaLimpieza = Objects.requireNonNull(habitacionParaLimpieza);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Apellidos apellidos() {
        return apellidos;
    }

    public HabitacionParaLimpieza habitacionParaLimpieza() {
        return habitacionParaLimpieza;
    }
}
