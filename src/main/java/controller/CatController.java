package controller;

import dto.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.CatRep;

import java.util.Optional;

@RestController

@RequestMapping(name = "", produces = "application/json")
public class CatController {

    @Autowired
    CatRep catRep;

    @RequestMapping("create-cat")
    public Cat createCat(){return catRep.save(new Cat(1,"Bob"));}

    @RequestMapping("find/{id}")
    public Optional<Cat> findCat(@PathVariable Long id){return catRep.findById(id);}

    @RequestMapping("delete/{id}")
    public void deleteCat(@PathVariable Long id){catRep.deleteById(id);}

    @RequestMapping("findAll")
    public void findAll() {
        catRep.findAll();
    }

    @RequestMapping("deleteAll")
    public void deleteAll() {
        catRep.deleteAll();
    }
    }
