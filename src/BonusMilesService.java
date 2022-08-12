public class BonusMilesService {
    int bonusOnOneMile = 20;
    public int calculate(int price){
        int result = price/bonusOnOneMile;
        return result;


    }
}
