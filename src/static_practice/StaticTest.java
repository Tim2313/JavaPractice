package static_practice;

public class StaticTest {

    public static void main(String[] args) {

        StaticClass staticObject1 = new StaticClass();
        StaticClass staticObject2 = new StaticClass();
        // Loh
        System.out.println(staticObject1.staticWord);

        // newStaticWord
        System.out.println(staticObject1.staticWord);

        // newStaticWord
        System.out.println(staticObject2.staticWord);

        // Loh
        System.out.println(StaticClass.staticWord);
    }
}
