public class BonusMilesService {
    public int calculate(int massa, double rost){
        double index= (int)massa/(rost*rost);
        return (int) index;
    }
}
