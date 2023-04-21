package giangtt.com.JavaBasic.variables;

public class SinhVien {
    public String name;
    public  int age = 19;

    public static int sl = 10;
    public SinhVien(){

    }

    public void setName(String name){
        this.name = name;
    }

    public void show(){
        sl = sl + 18;
        age = age + 11;
        System.out.println("name :" + name);
        System.out.println("age: " + age);
        System.out.println("sl:" + sl);
    }

    public static void main(String[] args) {
        SinhVien $sv = new SinhVien();
        sl = 22;
        $sv.age = $sv.age +10;
        $sv.setName("giangtt");
        $sv.show();
    }
}
