package checkOut.events;

import checkOut.FacturaConsumo;
import checkOut.values.ConsumoLavanderia;
import checkOut.values.FacturaConsumoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsumoLavanderiaModificado extends DomainEvent {

    private final FacturaConsumoId facturaConsumoId;
    private final ConsumoLavanderia consumoLavanderia;

    public ConsumoLavanderiaModificado(
            FacturaConsumoId facturaConsumoId,
            ConsumoLavanderia consumoLavanderia) {
        super("hotel.checkOut.consumoLavanderiaModificado");
        this.facturaConsumoId = facturaConsumoId;
        this.consumoLavanderia=consumoLavanderia;
    }

    public FacturaConsumoId getFacturaConsumoId() {
        return facturaConsumoId;
    }

    public ConsumoLavanderia getConsumoLavanderia() {
        return consumoLavanderia;
    }
}
