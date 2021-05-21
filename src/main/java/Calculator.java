public class Calculator {
    private Integer sum;
    Calculator() {
        sum = null;
    }

    public void add(int[] num) {
        for(int i=0; i<num.length; i++) {
            sum += num[i];
        }
    }

    public void subtract(int[] num) {
        for(int i=0; i<num.length; i++) {
            sum -= num[i];
        }
    }

    public int getSum() {
        return sum;
    }

}
