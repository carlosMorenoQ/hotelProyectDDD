package checkIn.events;

import checkIn.Huesped;
import checkIn.values.CheckInId;
import checkIn.values.ContratoHospedaje;
import checkIn.values.FechaLLegada;
import checkIn.values.Recepcionista;
import genericos.DomainEvent;

import java.util.Set;

public class CheckInCreado extends DomainEvent {

    private final FechaLLegada fechaLLegada;
    private final ContratoHospedaje contratoHospedaje;
    private final Recepcionista recepcionista;

    public CheckInCreado(FechaLLegada fechaLLegada, ContratoHospedaje contratoHospedaje, Recepcionista recepcionista) {
        super("checkIn.checkInCreado");
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
