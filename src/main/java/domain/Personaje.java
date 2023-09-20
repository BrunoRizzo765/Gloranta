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
    @Column(name = "puntosDeVida")
    private int puntosDeVida;

    public void atacar(Personaje personaje){
        return;
    }
}
