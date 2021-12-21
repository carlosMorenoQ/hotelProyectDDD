package checkIn;

import checkIn.values.HuespedId;
import checkIn.values.NombreHuesped;
import genericos.Entity;

public class Huesped extends Entity<HuespedId> {

    private NombreHuesped nombreHuesped;



    public Huesped(HuespedId huespedId) {
        super(huespedId);
    }


}
