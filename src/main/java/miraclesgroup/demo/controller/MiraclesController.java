package miraclesgroup.demo.controller;

import miraclesgroup.demo.entity.Company;
import miraclesgroup.demo.entity.Employee;
import miraclesgroup.demo.entity.Miracles;
import miraclesgroup.demo.repository.CompanyRepository;
import miraclesgroup.demo.repository.EmployeeRepository;
import miraclesgroup.demo.service.MiraclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/miracles")
public class MiraclesController {
    @Autowired
    MiraclesService miraclesService;

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Miracles> findAll(){
        return miraclesService.findAll();
    }


    @GetMapping("/company")
    public List<Company> findAllCompany(){
        return companyRepository.findAll();
    }

    @GetMapping("/employee")
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employee2")
    public List<Employee> findAllEmployee2(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employee3")
    public List<Employee> findAllEmployee3(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employee4")
    public List<Employee> findAllEmployee4(){
        return employeeRepository.findAll();
    }

}
