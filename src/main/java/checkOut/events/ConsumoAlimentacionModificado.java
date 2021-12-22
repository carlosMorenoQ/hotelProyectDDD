package checkOut.events;

import checkOut.FacturaConsumo;
import checkOut.values.ConsumoAlimentacion;
import checkOut.values.FacturaConsumoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsumoAlimentacionModificado extends DomainEvent {

    private final FacturaConsumoId facturaConsumoId;
    private final ConsumoAlimentacion consumoAlimentacion;

    public ConsumoAlimentacionModificado(
            FacturaConsumoId facturaConsumoId,
            ConsumoAlimentacion consumoAlimentacion) {
        super("hotel.checkOut.consumoAlimentacionModifcado");
        this.facturaConsumoId = facturaConsumoId;
        this.consumoAlimentacion = consumoAlimentacion;
    }

    public FacturaConsumoId getFacturaConsumoId() {
        return facturaConsumoId;
    }

    public ConsumoAlimentacion getConsumoAlimentacion() {
        return consumoAlimentacion;
    }
}
