import java.sql.SQLOutput;

public class Multiples {
    public static void main(String[] args) {
        int count_multiples = 0;
        for (int number = 1; number < 1000; number++) {
            if((number % 3 == 0) && (number % 5 == 0)) {
                count_multiples += 1;
            }
            else if(number % 3 == 0) {
                count_multiples += 1;
            } else if(number % 5 == 0) {
                count_multiples += 1;
            }
        }
        System.out.println(count_multiples);
    }
}
