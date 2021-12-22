package checkOut.values;

import checkOut.FacturaConsumo;
import co.com.sofka.domain.generic.Identity;

public class FacturaConsumoId extends Identity {

    public FacturaConsumoId(String value) {
        super(value);
    }

    public FacturaConsumoId() {
    }

    public static FacturaConsumoId of(String value){
        return new FacturaConsumoId(value);
    }
}
