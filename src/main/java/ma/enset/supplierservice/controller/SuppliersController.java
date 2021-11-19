package ma.enset.supplierservice.controller;

import ma.enset.supplierservice.entities.Supplier;
import ma.enset.supplierservice.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SuppliersController
{

    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping(path = "/suppliers")
    public List<Supplier> Afficher()
    {
        System.out.println("bonjour"+supplierRepository.findAll());
        return  supplierRepository.findAll();
    }
}
