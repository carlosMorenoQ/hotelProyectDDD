package checkIn;

import checkIn.values.*;
import genericos.AggregateRoot;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CheckIn extends AggregateRoot<CheckInID> {

    private final CheckInID checkInID;
    private FechaLLegada fechaLLegada;
    private Set<Huesped> Huespedes;
    private ContratoHospedaje contratoHospedaje;
    private Recepcionista recepcionista;

    public CheckIn(CheckInID checkInID, FechaLLegada fechaLLegada, Set<Huesped> huespedes, ContratoHospedaje contratoHospedaje, Recepcionista recepcionista) {
        super(checkInID);
        this.checkInID = Objects.requireNonNull(checkInID);
        this.fechaLLegada = Objects.requireNonNull(fechaLLegada);
        this.contratoHospedaje = Objects.requireNonNull(contratoHospedaje);
        this.recepcionista = Objects.requireNonNull(recepcionista);
        this.Huespedes = new HashSet<>();
        //Aqui va el evento de dominio
    }






}
