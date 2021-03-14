public class BonusMilesService {
    public int calculate(int price){
        double coefficient=0.05;
        int miles = (int) (price*coefficient);
        return miles;
    }
}
