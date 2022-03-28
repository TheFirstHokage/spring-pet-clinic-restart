package master.spring.springpetclinicrestart.map;

import master.spring.springpetclinicrestart.model.Owner;
import master.spring.springpetclinicrestart.service.CrudService;
import master.spring.springpetclinicrestart.service.OwnerService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {

        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
