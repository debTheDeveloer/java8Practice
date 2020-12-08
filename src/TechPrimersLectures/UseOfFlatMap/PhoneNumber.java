package TechPrimersLectures.UseOfFlatMap;

public class PhoneNumber {
    String phoneNumberString;

    public String getPhoneNumberString() {
        return phoneNumberString;
    }

    public void setPhoneNumberString(String phoneNumberString) {
        this.phoneNumberString = phoneNumberString;
    }

    public PhoneNumber(String phoneNumberString) {
        this.phoneNumberString = phoneNumberString;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumberString='" + phoneNumberString + '\'' +
                '}';
    }
}
