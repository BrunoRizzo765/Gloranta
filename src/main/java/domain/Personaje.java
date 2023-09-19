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
    @Convert
    @Column(name = "elementos")
    private List<ElementoDefensor> elementos;
    @Column(name = "stamina")
    private int stamina;
    @Column(name = "puntoDeVida")
    private int puntoDeVida;

    public void atacar(Personaje personaje){
        return;
    }
}
