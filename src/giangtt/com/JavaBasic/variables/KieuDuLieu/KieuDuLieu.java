package giangtt.com.JavaBasic.variables.KieuDuLieu;

public class KieuDuLieu {
     int numberInt = 100000000;
     char kyTu = 'a';
     boolean checkValue = true;

    public static void main(String[] args) {
        KieuDuLieu n = new KieuDuLieu();
        System.out.println(n.numberInt);
        System.out.println(Common.number1);
        System.out.println(Common.bankName);
        System.out.println(n.kyTu);
        Common c = new Common();
        int test = c.test;
    }
}
