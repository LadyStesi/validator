package homework20;

public class Main {

    public static void main(String[] args) {
        ValidationSystem vs = new ValidationSystem();
        System.out.println(vs.chooseValidator(4));
        ValidationSystem vs2 = new ValidationSystem();
        System.out.println(vs2.chooseValidator(12.6));

    }


}
