package edu.javeriana.ingenieria.social.barrio.repositorio;

import edu.javeriana.ingenieria.social.barrio.dominio.Barrio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioBarrio extends JpaRepository<Barrio, Integer> {
    Barrio findOneByCodigo(int codigo);

    boolean existsByCodigo(int codigo);
}
