package store.repositories;

import org.springframework.data.repository.CrudRepository;
import store.entities.Stock;

public interface StockRepositorio extends CrudRepository<Stock, Long>{
    
}
