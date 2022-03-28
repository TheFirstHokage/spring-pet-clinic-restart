package master.spring.springpetclinicrestart.service;

import master.spring.springpetclinicrestart.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);


}
