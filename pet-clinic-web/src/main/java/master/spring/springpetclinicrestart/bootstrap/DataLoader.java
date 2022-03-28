package master.spring.springpetclinicrestart.bootstrap;

import master.spring.springpetclinicrestart.map.OwnerMapService;
import master.spring.springpetclinicrestart.map.VetMapService;
import master.spring.springpetclinicrestart.model.Owner;
import master.spring.springpetclinicrestart.model.Vet;
import master.spring.springpetclinicrestart.service.OwnerService;
import master.spring.springpetclinicrestart.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//interface for init data
//component makes this a spring bean
@Component
public class DataLoader implements CommandLineRunner {

    private  OwnerService ownerService;
    private VetService vetService;

    public DataLoader() {
        this.ownerService =new OwnerMapService();
        this.vetService = new VetMapService();
    }





    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jerro");
        owner1.setLastName("Gillespie");
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Kendrick");
        owner2.setLastName("White");
        ownerService.save(owner2);

        System.out.println("Loading owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Reed");
        vet1.setLastName("Thompson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Avi");
        vet2.setLastName("Rafi");
        vetService.save(vet2);

        System.out.println("Loading vets...");






    }
}
