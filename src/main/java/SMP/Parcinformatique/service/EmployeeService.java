package SMP.Parcinformatique.service;

import SMP.Parcinformatique.Exception.UserNotFoundException;
import SMP.Parcinformatique.model.Employee;
import SMP.Parcinformatique.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private  final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }
    public Employee addEmployee(Employee employee){
        employee.setUtilisateur(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployee(){
        return  employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
         return employeeRepo.findEmployeeById(id)
                 .orElseThrow(() -> new UserNotFoundException("L'utilisateur n'existe pas"));
    }
    public void deleteEmployeeById(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}
