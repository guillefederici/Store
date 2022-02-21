package store.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import store.entities.Productos;
import store.repositories.ProductoRepositorio;

@Service
public class ProductosServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepositorio repo;    
    
    @Override
    public List<Productos> listarProductos() {
        return (List<Productos>) repo.findAll();
    }

    @Override
    @Transactional
    public void guardar(Productos producto) {
        repo.save(producto);
    }

    @Override
    @Transactional
    public void eliminar(Productos producto) {
        repo.delete(producto);
    }

    @Override
    public Productos encontrarProductos(Productos producto) {
        return repo.findById(producto.getIdProducto()).orElse(null);
    }
    
}
