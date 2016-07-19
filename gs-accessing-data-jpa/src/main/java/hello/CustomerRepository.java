package hello;

import java.util.List;

import org.springframework.data.repository.CredRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
