package domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ladron")
public class Ladron extends Personaje {
    @Column
    private int nivelSiniestro;
    @Column
    private boolean tieneNavaja;


}
