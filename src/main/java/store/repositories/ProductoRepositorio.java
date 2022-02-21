package store.repositories;

import org.springframework.data.repository.CrudRepository;
import store.entities.Productos;

public interface ProductoRepositorio extends CrudRepository<Productos, Long>{
    
}
