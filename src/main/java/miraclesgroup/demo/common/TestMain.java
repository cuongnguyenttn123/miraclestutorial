package miraclesgroup.demo.common;

import lombok.var;
import miraclesgroup.demo.dto.response.Customer;
import miraclesgroup.demo.entity.Miracles;
import miraclesgroup.demo.repository.MiraclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestMain {

    @Autowired
    MiraclesRepository miraclesRepository;
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Jack"));
        customers.add(new Customer(2, "James"));
        customers.add(new Customer(3, "Kelly"));

        Customer james = customers.stream()
                .filter(customer -> "James".equals(customer.getName()))
                .findAny()
                .orElse(null);

        System.out.println(james);
    }


}
