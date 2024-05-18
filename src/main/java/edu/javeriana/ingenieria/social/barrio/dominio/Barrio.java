package edu.javeriana.ingenieria.social.barrio.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Barrio {
    @Id
    private Integer id;
    private Integer codigo, localidad;
    private String nombre;
}
