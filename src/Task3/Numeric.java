package Task3;

public class Numeric<T extends Number> {
    T Tnum;

    Numeric(T n) {
        Tnum = n;
    }

    double getRec() {
        return 1 / Tnum.doubleValue();
    }

    double getFrac() {
        return Tnum.doubleValue() - Tnum.intValue();
    }

    boolean absEqual(Numeric<?> ob) {       // проверить равенство абсолютныъ значений, ? - метасимвол, шаблон аргументов
        if (Math.abs(Tnum.doubleValue()) == Math.abs(ob.Tnum.doubleValue())) {
            return true;
        } else {
            return false;
        }
    }
}

class Gen3 {
    public static void main(String[] args) {
        Numeric<Integer> iob;
        iob = new Numeric<>(6);

        Numeric<Double> dob;
        dob = new Numeric<>(-6.0);

        Numeric<Long> lob;
        lob = new Numeric<>(6L);

        System.out.println("iob and dob: " + iob.absEqual(dob));
        System.out.println("iob and lob: " + iob.absEqual(lob));
    }
}
