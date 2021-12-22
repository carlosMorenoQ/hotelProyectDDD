package checkIn.comands;

import checkIn.values.ContratoHospedaje;
import checkIn.values.FechaLLegada;
import checkOut.values.Recepcionista;
import co.com.sofka.domain.generic.Command;

public class CrearCheckIn extends Command {

    private final FechaLLegada fechaLLegada;
    private final ContratoHospedaje contratoHospedaje;
    private final Recepcionista recepcionista;

    public CrearCheckIn(FechaLLegada fechaLLegada, ContratoHospedaje contratoHospedaje, Recepcionista recepcionista) {
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
