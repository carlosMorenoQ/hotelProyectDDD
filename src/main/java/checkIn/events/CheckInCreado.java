package checkIn.events;

import checkIn.values.ContratoHospedaje;
import checkIn.values.FechaLLegada;
import checkOut.values.Recepcionista;
import co.com.sofka.domain.generic.DomainEvent;


public class CheckInCreado extends DomainEvent {

    private final FechaLLegada fechaLLegada;
    private final ContratoHospedaje contratoHospedaje;
    private final Recepcionista recepcionista;

    public CheckInCreado(FechaLLegada fechaLLegada, ContratoHospedaje contratoHospedaje, Recepcionista recepcionista) {
        super("hotel.checkIn.checkInCreado");
        this.fechaLLegada = fechaLLegada;
        this.contratoHospedaje = contratoHospedaje;
        this.recepcionista = recepcionista;
    }

    public FechaLLegada getFechaLLegada() {
        return fechaLLegada;
    }

    public ContratoHospedaje getContratoHospedaje() {
        return contratoHospedaje;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

}
