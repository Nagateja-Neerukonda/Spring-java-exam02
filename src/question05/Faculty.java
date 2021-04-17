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
public class Faculty extends Employee{
    private int officeHours;
    private int numberOfSubjects;

    public Faculty(int officeHours, int numberOfSubjects, String office,
            double salary, Date hiredDate, String name, String address, String phone, String email) {
        super(office, salary, hiredDate, name, address, phone, email);
        this.officeHours = officeHours;
        this.numberOfSubjects = numberOfSubjects;
    }

    @Override
    public String toString() {
        return "Faculty Name: " + super.getName();
    }
      
}

