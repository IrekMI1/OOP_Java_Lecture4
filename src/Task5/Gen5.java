package Task5;

import java.util.List;

public class Gen5 {
    private int sum;

// конструктор с обощением
//    <R extends Number> Gen5(R arg) {
//        sum = 0;
//        for (int i = 0; i <= arg.intValue(); i++) {
//            sum += i;
//        }
//    }

    <R extends Number> int getSum(R arg) {
        sum = 0;
        for (int i = 0; i <= arg.intValue(); i++) {
            sum += i;
        }
        return sum;
    }
}

class Gen5Demo {
    public static void main(String[] args) {
        Gen5 ob = new Gen5();

        System.out.println("Сумма целых чисел от 0 до 4 = " + ob.getSum(4L));
    }
}
