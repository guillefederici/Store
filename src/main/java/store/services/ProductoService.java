package store.services;

import java.util.List;
import store.entities.Productos;

public interface ProductoService {
    
    public List<Productos> listarProductos();
    
    public void guardar(Productos producto);
    
    public void eliminar(Productos producto);
    
    public Productos encontrarProductos(Productos producto);
}
