/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

import java.util.Date;

/**
 *
 * @author Neerukonda Nagateja
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new Date
        Date hiredDate = new Date(07, 07, 15);
        Person person = new Person("Teja", "Guntur", "7386645429", "Tejausa123@gmail.com");

        Student student = new Student(3.5, "sai", "vijayawada","8790898885", "sai@gmail.com");

        Employee employee = new Employee("Kondapur flat NO:8", 30000.0, hiredDate,
                "srikanth", "texas", "6605281476", "srikanth@gmail.com");

        Faculty faculty = new Faculty(40, 3, "vijag flat no:5", 198000.0,
                hiredDate, "Ajay", "Newyork", "6605281473", "Ajay@gmail.com");

        Staff staff = new Staff("professor", "Missouri", 30000.0,
                hiredDate, "tata", "Chicago", "6609803333",
                "tata@gmail.com");
        // Invoke toString of Person, Student, Employee, Faculty and Staff
        System.out.println("Person details.");
        System.out.println(person);
        System.out.println("");
        
        System.out.println("student details.");
        System.out.println(student);
        System.out.println("");
        
        System.out.println("employee details.");
        System.out.println(employee);
        System.out.println("");
        
        System.out.println("faculty details.");
        System.out.println(faculty);
        System.out.println("");
        
        System.out.println("staff details.");
        System.out.println(staff);
    }
}
