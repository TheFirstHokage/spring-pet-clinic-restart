package master.spring.springpetclinicrestart.map;

import master.spring.springpetclinicrestart.model.Pet;
import master.spring.springpetclinicrestart.service.CrudService;
import master.spring.springpetclinicrestart.service.PetService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {


    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public Pet findById(Long id) {
        return null;
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {

        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
