package edu.javeriana.ingenieria.social.barrio.controlador;

import edu.javeriana.ingenieria.social.barrio.dominio.Barrio;
import edu.javeriana.ingenieria.social.barrio.servicio.ServicioBarrio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barrios")
@CrossOrigin(origins="http://localhost:4200")
public class ControladorBarrio {
    @Autowired
    private ServicioBarrio servicio;

    @GetMapping("listar")
    public List<Barrio> obtenerBarrios() {
        return servicio.obtenerBarrios();
    }

    @GetMapping("obtener")
    public ResponseEntity<Barrio> obtenerBarrio(@RequestParam Integer codigo) {
        if(codigo==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.barrioExiste(codigo)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerBarrio(codigo), HttpStatus.OK);
    }
}
