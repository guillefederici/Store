package store.repositories;

import org.springframework.data.repository.CrudRepository;
import store.entities.Marcas;

public interface MarcaRepositorio extends CrudRepository<Marcas, Long>{
    
}
