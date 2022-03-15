package master.spring.springpetclinicrestart.service;

import master.spring.springpetclinicrestart.model.Owner;

import java.util.Set;

public interface Vet {

    Vet findById(Long id);


    Vet save(Vet vet);

    Set<Vet> findAll();
}
