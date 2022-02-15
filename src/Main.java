public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 65_0000;
        int index = service.calculate(mass);
        System.out.println("Индекс массы тела составил:");
        System.out.println(index);
    }
}

