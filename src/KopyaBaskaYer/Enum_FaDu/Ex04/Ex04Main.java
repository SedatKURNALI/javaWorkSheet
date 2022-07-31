package KopyaBaskaYer.Enum_FaDu.Ex04;

public class Ex04Main {
    public static void main(String[] args) {

        Aylar ay = Aylar.SUBAT;
        ay.getGunMiktari(); // enum method call edildi
        System.out.println("ay.days = " + ay.days);
        System.out.println("ay = " + ay);


    }
}
