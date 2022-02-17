public class BmiService {
    public int calculate(int mass, int height) {
        int index = mass / (height * height);
        return index;
    }
}
