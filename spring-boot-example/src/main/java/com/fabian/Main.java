package com.fabian;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController // implies that the returned response is in JSON
@RequestMapping("api/v1/customers")
public class Main {
    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping()
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    record NewCustomer(
            String name,
            String email,
            Integer age
    ){}

    @PostMapping
    public void addCustomer(@RequestBody NewCustomer request) { // RequestBody of this request is simply mapped to match "NewCustomer" class
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());

        customerRepository.save(customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer( @PathVariable("customerId") Integer id) {

        // could do some business-logic here, like checking if the customer exists or not, but...

        customerRepository.deleteById(id);
    }

    @PutMapping("{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer id, @RequestBody NewCustomer request) {
       Optional<Customer> customer = customerRepository.findById(id);
       Customer myCustomer = customer.orElse(null);
        assert myCustomer != null;
        myCustomer.setAge(request.age());
        customerRepository.save(myCustomer);
    }
}
