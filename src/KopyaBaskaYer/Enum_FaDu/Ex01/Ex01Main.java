package Enum_FaDu.Ex01;

public class Ex01Main {
    public static void main(String[] args) {

        // verilen ay numarasina gore ayin kac gun oldugunu print ediniz

        Aylar ay = Aylar.NISAN; // enum yapidan bir field create ettik.
        // int ay = 4;
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        switch (ay) {
            case OCAK:
                System.out.println("Ocak");
                break;
            case SUBAT:
                System.out.println("Subat");
                break;
            case MART:
                System.out.println("Mart");
                break;
            case NISAN:
                System.out.println("Nisan guzel insan");
                break;
            case MAYIS:
                System.out.println("Mayis");
                break;
            case HAZIRAN:
                System.out.println("Haziran");
                break;
            case TEMMUZ:
                System.out.println("Temmuz");
                break;
            case AGUSTOS:
                System.out.println("Agustos");
                break;
            case EYLUL:
                System.out.println("Eylul");
                break;
            case EKIM:
                System.out.println("Ekim");
                break;
            case KASIM:
                System.out.println("Kasim");
                break;
            case ARALIK:
                System.out.println("Aralik");
                break;

        }


    }
}
