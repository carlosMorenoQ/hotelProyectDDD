package checkIn;

import co.com.sofka.domain.generic.EventChange;
import checkIn.events.CheckInCreado;
import java.util.HashSet;

public class CheckInChange extends EventChange {

    public CheckInChange(CheckIn checkIn){

        apply((CheckInCreado event) -> {
//            checkIn.fechaLLegada = event.getFechaLLegada();
//            checkIn.contratoHospedaje =event.getContratoHospedaje();
//            checkIn.recepcionista = event.getRecepcionista();
//            checkIn.huespedes = new HashSet<Huesped>();
        });




    }
}
