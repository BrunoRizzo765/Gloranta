package domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ladron")
public class Ladron extends Personaje {
    @Column(name = "nivelSiniestro")
    private int nivelSiniestro;
    @Column(name = "tieneNavaja")
    private boolean tieneNavaja;


}
