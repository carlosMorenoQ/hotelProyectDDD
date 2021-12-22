package checkOut;

import checkOut.events.ConsumoAlimentacionModificado;
import checkOut.events.ConsumoLavanderiaModificado;
import checkOut.events.ConsumoMinibarModificado;
import checkOut.events.HabitacionParaLimpiezaAsignada;
import checkOut.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class CheckOut extends AggregateEvent<CheckOutId> {

    protected Camarera camarera;
    protected FacturaConsumo facturaConsumo;
    protected Recepcionista recepcionista;
    protected FechaSalida fechaSalida;

    public CheckOut(
            CheckOutId checkOutId,
            Camarera camarera,
            FacturaConsumo facturaConsumo,
            Recepcionista recepcionista,
            FechaSalida fechaSalida) {
        super(checkOutId);
        this.camarera = camarera;
        this.facturaConsumo = facturaConsumo;
        this.recepcionista = recepcionista;
        this.fechaSalida = fechaSalida;
    }

    public CheckOut(CheckOutId checkOutId){
        super(checkOutId);
        subscribe(new CheckOutChange(this));
    }

    public void asignarHabitacionParaLimpieza(
            CamareraId camareraId,
            HabitacionParaLimpieza habitacionParaLimpieza) {

        Objects.requireNonNull(camareraId);
        Objects.requireNonNull(habitacionParaLimpieza);
        appendChange(new HabitacionParaLimpiezaAsignada(
                camareraId,
                habitacionParaLimpieza
        )).apply();
    }

    public void modificarConsumoMinibar(
            FacturaConsumoId facturaConsumoId,
            ConsumoMinibar consumoMinibar) {

        Objects.requireNonNull(facturaConsumoId);
        Objects.requireNonNull(consumoMinibar);
        appendChange(new ConsumoMinibarModificado(
                facturaConsumoId,
                consumoMinibar
        )).apply();
    }

    public void modificarConsumoLavanderia(
            FacturaConsumoId facturaConsumoId,
            ConsumoLavanderia consumoLavanderia) {

        Objects.requireNonNull(facturaConsumoId);
        Objects.requireNonNull(consumoLavanderia);
        appendChange(new ConsumoLavanderiaModificado(
                facturaConsumoId,
                consumoLavanderia
        )).apply();
    }

    public void modificarConsumoAlimentacion(
            FacturaConsumoId facturaConsumoId,
            ConsumoAlimentacion consumoAlimentacion) {

        Objects.requireNonNull(facturaConsumoId);
        Objects.requireNonNull(consumoAlimentacion);
        appendChange(new ConsumoAlimentacionModificado(
                facturaConsumoId,
                consumoAlimentacion
        )).apply();
    }

    public Camarera camarera() {
        return camarera;
    }

    public FacturaConsumo facturaConsumo() {
        return facturaConsumo;
    }

    public Recepcionista recepcionista() {
        return recepcionista;
    }

    public FechaSalida fechaSalida() {
        return fechaSalida;
    }
}
