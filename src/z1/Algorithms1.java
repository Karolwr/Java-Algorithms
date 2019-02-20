package z1;

public class Algorithms1 {
    public int power(int x, int y) {
        //1
        //2
        int result = 1;
        //3
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    //algorytm silnia z n
    public int silnia(int n) {
        int sum = 1;
        for (int i = n; i > 1; i--) {
            sum = sum * i;
        }
        return sum;
    }
    public int geoSequence(int a0, int q, int n){
        int sum = 0;
        for (int i = 0; i <=n-1; i++ ){
            sum = sum + (a0 * power(q,i));
        }
        return sum;
    }
    public int altSequence(int a0, int r, int n){
        int sum = 0;
        for (int i = 0; i <=n-1; i++ ){
            sum = sum + (a0 + i * r);
        }
        return sum;
    }
    public boolean perfectNumber(int number){
        int sum = 0;
        for (int i = 1; i<number; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        return number == sum ? true : false;
    }
}

