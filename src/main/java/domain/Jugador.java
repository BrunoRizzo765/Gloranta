package domain;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String apellido;
    @Convert
    private LocalDate fechaAlta;
    @Column
    private String nombre;
    @OneToOne
    private Personaje personaje;

    public void cambiarPersonaje(Personaje p){return;}
}
