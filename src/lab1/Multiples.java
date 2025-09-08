package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3 ,5));
    }

    public static int multiples(int n, int a, int b) {
        int counter = 0;
        for(int i=1;i< n;i++){
            if (i % b == 0 || i % a == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int multiples() {
        int counter = 0;
        for(int i=1;i< 1000;i++){
            if (i % 3 == 0 || i % 5 == 0){
                counter++;
            }
        }
        return counter;
    }
}
