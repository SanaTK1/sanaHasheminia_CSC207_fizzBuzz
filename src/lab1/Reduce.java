package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reducer(100));
    }

    private static int reducer(int n) {
        int counter = 0;
        while (n > 0){
            if(n%2 == 0)
                n = n/2;
            n--;
            counter++;
        }
        return counter;
    }
}
