package Task1;

public class Gen<T> {
    T ob;           // Объявить объект типа Т

    Gen(T o) {      // передать конструктору объект типа Т
        ob = o;
    }

    T getOb() {     // вернуть объект ob из метода
        return ob;
    }

    void showType() {   // отобразить тип T
        System.out.println("Тип Т это: " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;       // создаем ссылку на объект типа Integer
        iob = new Gen<Integer>(88); // создание экземпляра типа Integer

        iob.showType();         // отобразить тип данных iob

        int v = iob.getOb();    // присвоили примитиву значение объекта iob
        System.out.println("Значение:" + v);

        System.out.println();

        Gen<String> str = new Gen<String>("TestMessage");
        str.showType();             // отобразить тип данных iob
        String str1 = str.getOb();  // присвоили str1 значение объекта iob
        System.out.println("Значение " + str1);
    }
}