public class BmiService {
    public int calculate(int mass) {
        int height = 184;
        int index = mass / (height * height);
        return index;
    }
}
