package reserva.comands;

import co.com.sofka.domain.generic.Command;
import reserva.MedioDePago;
import reserva.values.TitularId;

public class ModificarMedioDePago extends Command {

    private final TitularId titularId;
    private final MedioDePago medioDePago;

    public ModificarMedioDePago(
            TitularId titularId,
            MedioDePago medioDePago) {
        this.titularId = titularId;
        this.medioDePago = medioDePago;
    }

    public TitularId getTitularId() {
        return titularId;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

}
