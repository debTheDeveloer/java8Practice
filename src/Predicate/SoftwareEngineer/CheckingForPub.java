package Predicate.SoftwareEngineer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckingForPub {
    public static void main(String[] args){
        List<SoftwareEngineer> seList= createSoftwareEngineerList();
        List<String>eligible = new ArrayList();
        Predicate<SoftwareEngineer> p = se->se.isHavingTicket()&&se.getAge()>=18;
        for (SoftwareEngineer s: seList) {
            if(p.test(s)) {
                System.out.println(s.getName());
                eligible.add(s.getName());
            }
        }
        System.out.println("Printing the eligible name List: "+eligible);
    }

    private static List<SoftwareEngineer> createSoftwareEngineerList() {
        List<SoftwareEngineer> seList = new ArrayList<>();
        SoftwareEngineer se1 = new SoftwareEngineer();
        se1.setAge(20);
        se1.setHavingTicket(true);
        se1.setName("Arka");
        SoftwareEngineer se2 = new SoftwareEngineer();
        se2.setName("Debajyoti");
        se2.setHavingTicket(false);
        se2.setAge(25);
        SoftwareEngineer se3 = new SoftwareEngineer();
        se3.setAge(17);
        se3.setHavingTicket(true);
        se3.setName("Ram");
        SoftwareEngineer se4 = new SoftwareEngineer();
        se4.setName("Shyam");
        se4.setHavingTicket(true);
        se4.setAge(24);
        seList.add(se1);
        seList.add(se2);
        seList.add(se3);
        seList.add(se4);

        return seList;
    }
}
