package domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("mago")
public class Mago extends Personaje{
    @Column(name = "nivelDeMagia")
    private int nivelDeMagia;
    @Column(name = "tieneAlas")
    private  boolean tieneAlas;
}
