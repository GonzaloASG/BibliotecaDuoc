package cl.duoc.biblioteca.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.biblioteca.modelo.Libro;
import cl.duoc.biblioteca.repositorio.LibroRepositorio;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LibroServicio {


    private LibroRepositorio repositorio;


    public List<Libro> obtenerTodos(){
        return repositorio.findAll();
    }

}
