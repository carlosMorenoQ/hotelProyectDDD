package checkOut;

import checkOut.events.ConsumoAlimentacionModificado;
import checkOut.events.ConsumoLavanderiaModificado;
import checkOut.events.ConsumoMinibarModificado;
import checkOut.events.HabitacionParaLimpiezaAsignada;
import co.com.sofka.domain.generic.EventChange;

public class CheckOutChange extends EventChange {


    public CheckOutChange(CheckOut checkOut) {

        apply((ConsumoAlimentacionModificado event)->{
            checkOut.facturaConsumo.modificarConsumoAlimentacion(event.getConsumoAlimentacion());
        });

        apply((ConsumoLavanderiaModificado event)->{
            checkOut.facturaConsumo.modificarConsumoLavanderia(event.getConsumoLavanderia());
        });

        apply((ConsumoMinibarModificado event)->{
            checkOut.facturaConsumo.modificarConsumoMinibar(event.getConsumoMinibar());
        });

        apply((HabitacionParaLimpiezaAsignada event)->{
            checkOut.camarera.asignarHabitacionParaLimpieza(event.getHabitacionParaLimpieza());
        });
    }
}
