package edu.javeriana.ingenieria.social.barrio.servicio;

import edu.javeriana.ingenieria.social.barrio.dominio.Barrio;
import edu.javeriana.ingenieria.social.barrio.repositorio.RepositorioBarrio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioBarrio {
    @Autowired
    private RepositorioBarrio repositorio;

    public List<Barrio> obtenerBarrios(){
        return repositorio.findAll();
    }

    public Barrio obtenerBarrio(int codigo) {
        return repositorio.findOneByCodigo(codigo);
    }

    public boolean barrioExiste(int codigo) {
        return repositorio.existsByCodigo(codigo);
    }
}
