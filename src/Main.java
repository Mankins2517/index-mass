public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int massa=75;
        double rost=1.75;
        int index= service.calculate(massa, rost);
        System.out.println(index);
    }
}