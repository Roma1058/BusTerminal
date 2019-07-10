package roman.kononenko.busterminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import roman.kononenko.busterminal.entity.Stop;
import roman.kononenko.busterminal.repository.AddressRepository;
import roman.kononenko.busterminal.repository.StopRepository;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@SpringBootApplication
public class BusterminalApplication {

    @Autowired
    private StopRepository stopRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostConstruct
    private void init()
    {
       /* Scanner sc = new Scanner(System.in);
        boolean out = false;

        while(out != true)
        {
            System.out.println("1 - Create");
            System.out.println("2 - Show");
            System.out.println("3 - Exit");

            switch (sc.nextInt())
            {
                case 1:
                    System.out.print("Enter name: ");
                    Stop stop = new Stop();
                    stop.setPlaceName(sc.next());
                    stopRepository.save(stop);
                    break;
                case 2:
                    System.out.println("All:");
                    stopRepository.findAll().forEach(i -> System.out.println(i.getId() + ". " + i.getPlaceName()));
                    break;

                case 3:
                    out = true;
                    break;
            }
        }*/

      /* addressRepository.findAll().forEach(a -> System.out.println(a.getId() + ". " + a.getCountry() + "-"
                                            + a.getCity() + "-" + a.getStreet() + "_" + a.getHouseNum()));

        System.out.print("Choose: ");
        Scanner sc = new Scanner(System.in);
       stopRepository.findAllByAddress_Id(sc.nextLong()).forEach(e -> System.out.println(e.getPlaceName()));*/
    }

    public static void main(String[] args) {
        SpringApplication.run(BusterminalApplication.class, args);
    }

}
