package checkOut.events;

import checkOut.values.ConsumoMinibar;
import checkOut.values.FacturaConsumoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsumoMinibarModificado extends DomainEvent {
    public ConsumoMinibarModificado(FacturaConsumoId facturaConsumoId, ConsumoMinibar consumoMinibar) {
        super();
    }
}
