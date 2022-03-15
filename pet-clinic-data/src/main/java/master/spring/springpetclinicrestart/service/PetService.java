package master.spring.springpetclinicrestart.service;

import master.spring.springpetclinicrestart.model.Owner;
import master.spring.springpetclinicrestart.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
