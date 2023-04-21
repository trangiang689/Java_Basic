package giangtt.com.JavaBasic.variables;

public class LearnVariable {
    static int age = 12;
    public static void main(String[] args) {
        System.out.println(age);
        String fullName = "giangtt";

        System.out.println("test auto");

        LearnVariable $new = new LearnVariable();
        $new.n();
        nStatic();
    }

    public void n(){
        int n = 10;//bien local
        int b = 2;
        System.out.println("n =" + n);
    }

    public static void nStatic(){
        int n = 120;//bien local
        System.out.println("n =" + n);
    }
}
