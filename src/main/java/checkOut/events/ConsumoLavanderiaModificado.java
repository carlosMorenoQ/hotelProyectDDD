package checkOut.events;

import checkOut.values.ConsumoLavanderia;
import checkOut.values.FacturaConsumoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsumoLavanderiaModificado extends DomainEvent {
    public ConsumoLavanderiaModificado(FacturaConsumoId facturaConsumoId, ConsumoLavanderia consumoLavanderia) {
        super();
    }
}
