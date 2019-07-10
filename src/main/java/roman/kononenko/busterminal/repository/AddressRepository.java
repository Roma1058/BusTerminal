package roman.kononenko.busterminal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import roman.kononenko.busterminal.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
