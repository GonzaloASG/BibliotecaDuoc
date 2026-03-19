package cl.duoc.biblioteca.controlador;


import org.springframework.web.bind.annotation.RestController;

import cl.duoc.biblioteca.servicio.LibroServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
public class LibroControlador {

    private final LibroServicio servicio;

    @GetMapping("/libros")
        public 
    }
    


}
