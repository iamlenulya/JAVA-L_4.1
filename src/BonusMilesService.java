public class BonusMilesService {
    public static int calculate(int cost) {
        int miles = 20;
        int amount = cost / miles;

        return amount;
    }
}