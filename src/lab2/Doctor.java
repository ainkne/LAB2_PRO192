package lab2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doctor {
    String id, name, spec, avail;
    public Doctor(){}

    public Doctor(String id, String name, String spec, String avail) {
        this.id = id;
        this.name = name;
        this.spec = spec;
        this.avail = avail;
    }

    public void outputDoctor() {
        System.out.printf("%-10s%-10s%-30s%-30s",getId(),getName(),getSpec(),getAvail());
    }
}
