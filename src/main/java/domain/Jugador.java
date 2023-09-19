package domain;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "apellido")
    private String apellido;
    @Convert
    @Column(name = "fechaAlta")
    private LocalDate fechaAlta;
    @Column(name = "nombre")
    private String nombre;
    @OneToOne
    @Column(name = "personaje")
    private Personaje personaje;

    public void cambiarPersonaje(Personaje p){return;}
}
