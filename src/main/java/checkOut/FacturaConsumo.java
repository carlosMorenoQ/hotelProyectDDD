package checkOut;

import checkOut.values.ConsumoAlimentacion;
import checkOut.values.ConsumoLavanderia;
import checkOut.values.ConsumoMinibar;
import checkOut.values.FacturaConsumoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class FacturaConsumo extends Entity<FacturaConsumoId> {


    private ConsumoMinibar consumoMinibar;
    private ConsumoLavanderia consumoLavanderia;
    private ConsumoAlimentacion consumoAlimentacion;

    public FacturaConsumo(
            FacturaConsumoId facturaConsumoId,
            ConsumoMinibar consumoMinibar,
            ConsumoLavanderia consumoLavanderia,
            ConsumoAlimentacion consumoAlimentacion) {
        super(facturaConsumoId);
        this.consumoMinibar = consumoMinibar;
        this.consumoLavanderia = consumoLavanderia;
        this.consumoAlimentacion = consumoAlimentacion;
    }


    public void modificarConsumoMinibar(ConsumoMinibar consumoMinibar){
        this.consumoMinibar = Objects.requireNonNull(consumoMinibar);
    }

    public void modificarConsumoLavanderia(ConsumoLavanderia consumoLavanderia){
        this.consumoLavanderia = Objects.requireNonNull(consumoLavanderia);
    }

    public void modificarConsumoAlimentacion(ConsumoAlimentacion consumoAlimentacion){
        this.consumoAlimentacion = Objects.requireNonNull(consumoAlimentacion);
    }

    public ConsumoMinibar consumoMinibar() {
        return consumoMinibar;
    }

    public ConsumoLavanderia consumoLavanderia() {
        return consumoLavanderia;
    }

    public ConsumoAlimentacion consumoAlimentacion() {
        return consumoAlimentacion;
    }


}
