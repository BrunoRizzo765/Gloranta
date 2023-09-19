package domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("mago")
public class Mago extends Personaje{
    @Column
    private int nivelDeMagia;
    @Column
    private  boolean tieneAlas;
}
