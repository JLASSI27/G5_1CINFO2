public class Jlmedamine {

    private int number;
    private int power;
    private int result;

    public Jlmedamine(int number, int power) {
        this.number = number;
        this.power = power;
        this.result = calculatePower(number, power);
    }

    static int calculatePower(int num, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return num * calculatePower(num, pow - 1);
        }
    }

    @Override
    public String toString() {
        return number + "^" + power + "=" + result;
    }

    public static void main(String[] args) {
        Jlmedamine jl = new Jlmedamine(3, 3);
        System.out.println(jl);
    }
}