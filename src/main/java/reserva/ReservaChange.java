package reserva;

import co.com.sofka.domain.generic.EventChange;
import reserva.events.DowngradeRealizado;
import reserva.events.MedioDePagoModificado;
import reserva.events.UpgradeRealizado;

public class ReservaChange extends EventChange {

    public ReservaChange(Reserva reserva){

        apply((DowngradeRealizado event)->{
            var habitacion = reserva.getHabitacionPorId(event.getHabitacionId())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro la habitacion"));
            habitacion.modificarTipoHabitacion(event.getTipoAcomodacion());
        });

        apply((UpgradeRealizado event)->{
            var habitacion = reserva.getHabitacionPorId(event.getHabitacionId())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro la habitacion"));
            habitacion.modificarTipoHabitacion(event.getTipoAcomodacion());
        });

        apply((MedioDePagoModificado event)-> {
            reserva.titular.modificarMedioDePago(event.getMedioDePago());
        });

    }
}
