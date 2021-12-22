package checkOut.events;

import checkOut.values.ConsumoAlimentacion;
import checkOut.values.FacturaConsumoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsumoAlimentacionModificado extends DomainEvent {
    public ConsumoAlimentacionModificado(FacturaConsumoId facturaConsumoId, ConsumoAlimentacion consumoAlimentacion) {
        super();
    }
}
