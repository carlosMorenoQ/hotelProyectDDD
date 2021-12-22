package checkOut.events;

import checkOut.FacturaConsumo;
import checkOut.values.ConsumoMinibar;
import checkOut.values.FacturaConsumoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsumoMinibarModificado extends DomainEvent {

    private final FacturaConsumoId facturaConsumoId;
    private final ConsumoMinibar consumoMinibar;

    public ConsumoMinibarModificado(
            FacturaConsumoId facturaConsumoId,
            ConsumoMinibar consumoMinibar) {
        super("hotel.checkOut.consumoMinibarModificado");
        this.consumoMinibar = consumoMinibar;
        this.facturaConsumoId = facturaConsumoId;
    }

    public FacturaConsumoId getFacturaConsumoId() {
        return facturaConsumoId;
    }

    public ConsumoMinibar getConsumoMinibar() {
        return consumoMinibar;
    }
}
