package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorList {
    private static final List<Doctor> doctorList = new ArrayList<>();
    public static void AddDoctor(){
        Doctor doctor = new Doctor();
        System.out.print("Enter code: ");
        String id = Validation.inputString();
        doctor.setId(id);
        System.out.print("Enter name: ");
        String name = Validation.inputString();
        doctor.setName(name);
        System.out.print("Enter specialization: ");
        String spec = Validation.inputString();
        doctor.setSpec(spec);
        System.out.print("Enter Availability: ");
        String avail = Validation.inputString();
        doctor.setAvail(avail);
        doctorList.add(doctor);
    }

    public static void PrintDoctors(){
        System.out.printf("%-10s%-10s%-30s%-30s\n", "Code", "Name",
                "Specialization", "Availability");
        doctorList.forEach(Doctor::outputDoctor);
    }
}
