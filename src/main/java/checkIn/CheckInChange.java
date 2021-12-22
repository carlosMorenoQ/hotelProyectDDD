package checkIn;

import checkIn.events.*;
import checkIn.values.LLaveHabitacionId;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CheckInChange extends EventChange {

    public CheckInChange(CheckIn checkIn) {

        apply((CheckInCreado event) -> {
            checkIn.fechaLLegada = event.getFechaLLegada();
            checkIn.contratoHospedaje = event.getContratoHospedaje();
            checkIn.recepcionista = event.getRecepcionista();
            checkIn.huespedes = new HashSet<Huesped>();
        });

        apply((HuespedAgregado event) -> {
            checkIn.huespedes.add(new Huesped(
                    event.getHuespedId(),
                    event.getNombreHuesped(),
                    event.getApellidoHuesped(),
                    event.getEdadHuesped(),
                    event.getNumeroHabitacionHuesped()
            ));
        });

        apply((LLaveHabitacionAsociada event) -> {
            checkIn.lLaveHabitacion = new LLaveHabitacion(
                    event.getlLaveHabitacionId(),
                    event.getNumeroHabitacionEnLLave());
        });

        apply((NumeroHabitacionEnLLaveModificado event) -> {
            checkIn.llaveHabitacion().asignarNumeroHabitacionEnLLave(
                    event.getNumeroHabitacionEnLLave()
            );
        });

        apply((NumeroHabitacionHuespedModificado event) -> {
            var huesped = checkIn.getHuespedPorId(event.getHuespedId())
                            .orElseThrow(()-> new IllegalArgumentException("No se encuentra el huesped"));
            huesped.modificarNumeroHabitacionEnHuesped(event.numeroHabitacionHuesped);

        });

    }
}
