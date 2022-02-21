package store.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import store.entities.Productos;
import store.services.ProductosServiceImpl;

@Controller
@RequestMapping("/producto")
public class ProductosControlador {
    
    @Autowired
    private ProductosServiceImpl service;
    
    @GetMapping("/listar")
    public String listarProductos(Model model){
        
        List<Productos> productos = service.listarProductos();
        model.addAttribute("productos", productos);
        return "listaProductos";
    }
    
    @GetMapping("/agregar")
    public String agregarAutor(Productos producto){
        return "modificarProducto";
    }
    
    @PostMapping("/guardar")
    public String guardarProducto(@Valid Productos producto, Errors errores){ //con el @Valid le indicamos qué objeto queremos que valide
        if (errores.hasErrors()) {
            return "modificarProducto";
        }
        service.guardar(producto);
        return "redirect:/producto/listar";
    }
    
    @GetMapping("/editar/{idProducto}")
    public String editar(Productos producto, Model model){
        producto = service.encontrarProductos(producto);
        model.addAttribute("producto", producto);
        return "modificarProducto";
    }
    
    @GetMapping("/eliminar")
    public String eliminarProducto(Productos producto){
        service.eliminar(producto);
        return "redirect:/listar";
    }
}
