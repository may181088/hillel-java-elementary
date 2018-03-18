package ua.od.hillel;


import java.util.stream.IntStream;

//=======File1======
public class Main {

    // mvn archetype:generate -DgroupId=com.mkyong.core.utils -DartifactId=dateUtils -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
    public static void main(String[] args) {
        //intStreamExamples();

        // initialisation
        Pie p1 = new Pie();
        Pie p2 = new Pie();
        Pie p3 = new Pie(100);

        // ======status=======
        System.out.println("=================");
        System.out.println(p1.testo);
        System.out.println(p2.testo);
        System.out.println(p3.testo);
    }

    /**
     * Java 8: Replace traditional "for" loops with IntStreams
     */
    public static void intStreamExamples() {
//        IntStream.of(1, 2, 3);// > 1, 2, 3
//        IntStream.range(1, 3);// > 1, 2
//        IntStream.rangeClosed(1, 3);// > 1, 2, 3
//        IntStream.range(1, 5).filter(i -> i % 2 == 0).allMatch(i -> i % 2 == 0);// > true
//        IntStream.range(1, 5).filter(i -> i % 2 == 0).noneMatch(i -> i % 2 != 0);// > true
//        IntStream.range(1, 5).anyMatch(i -> i % 2 == 0);// > true
//        IntStream.range(1, 5).max().getAsInt();// > 4
//        IntStream.range(1, 5).min().getAsInt();// > 1
//        IntStream.iterate(0, i -> i + 2).limit(3);// > 0, 2, 4
//        IntStream.range(1, 5).reduce(1, (x, y) -> x * y);// > 24

        IntStream.rangeClosed(1, 8).forEach(i -> anyOperation(i));
    }
    public static void anyOperation(int i) {
        System.out.println(i);
    }
}

//=======File2=======
class Pie {
    static {
        System.out.println("я загрузился и доступен для создания пирогов!");
    }

    public int cena = 250;
    public int testo = 150;
    public int vishnea = 100;

    {
        System.out.println("я начал инициализироваться!" + cena);
    }

    Pie() {
        System.out.println("я создался!");
        System.out.println(this.testo);
    }

    Pie(int testo) {
        this.testo = testo;
        System.out.println(this.testo);
    }


    public void otcusiti5procentov() {
        testo -= Math.random() * 5;
        vishnea -= Math.random() * 3;
    }

    public void skidka() {
        cena -= 50;
    }

    public void showCena() {
        System.out.println("Цена:" + cena);
    }
}
