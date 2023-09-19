package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipoPersonaje")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToMany
    @Convert
    private List<ElementoDefensor> elementos;
    @Column
    private int stamina;
    @Column
    private int puntodeVida;

    public void atacar(Personaje personaje){
        return;
    }
}
