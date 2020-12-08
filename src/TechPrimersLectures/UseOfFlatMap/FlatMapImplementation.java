package TechPrimersLectures.UseOfFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapImplementation {
    public static void main(String[] args) {
        List<User> listUser = Arrays.asList(new User("Arka", 26, Arrays.asList(new PhoneNumber("2"), new PhoneNumber("3"))),
                new User("Debajyoti", 26, Arrays.asList(new PhoneNumber("4"), new PhoneNumber("5"))),
                new User("Anup", 26, Arrays.asList(new PhoneNumber("6"))),
                new User("Sai", 26, Arrays.asList(new PhoneNumber("7"), new PhoneNumber("8"))));


        List<PhoneNumber>listPhn =listUser.stream().flatMap(user->user.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(listPhn.stream().filter(ph->ph.getPhoneNumberString().equals("6")).map(PhoneNumber::getPhoneNumberString).findFirst().orElse
                ("not Found"));

        System.out.println(listUser.stream()
                .flatMap(user->user.getPhoneNumbers().stream()
                .filter(ph->ph.getPhoneNumberString().equals("6"))
                .map(ph->ph.getPhoneNumberString()+user.getName())).findFirst()
                .orElse("not Found"));

        System.out.println(listUser.stream().flatMap(user->user.getPhoneNumbers().stream()
        .filter(ph->ph.getPhoneNumberString().equals("5")).map(ph->ph.getPhoneNumberString()+" "+user.getName()))
        .findFirst().orElse("Not Found"));

    }

}
