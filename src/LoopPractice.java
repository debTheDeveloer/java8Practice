import java.util.ArrayList;

public class LoopPractice {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Arka");
        al.add("Rudra");
        al.add("Richie");
        al.add("Tubai");
        al.add("Noel");
        int count =1;

        for (int i=0;i<al.size();i++){
            System.out.println(al.size());
            System.out.println(al.get(i));
            count++;
            if (count>5)
                break;;
        }
    }
}
