import SMP.Parcinformatique.model.Employee;
import SMP.Parcinformatique.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    private final EmployeeService employeeservice;


    public EmployeeResource(EmployeeService employeeservice) {
        this.employeeservice = employeeservice;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee () {
        List<Employee> employees = employeeservice.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Long id) {
        Employee employee = employeeservice.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeservice.addEmployee(employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updateEmployee = employeeservice.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeservice.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
