public class DataTypes {
    public static void main(String[] args) {

        // liczby całkowite
        // byte -

        System.out.println(2344);
        System.out.println(2244445L);
        byte b = -120;
        short s = 31678;
        int i = 1_123_123_789;
        System.out.println(i);
        long l = i * b;
        long iteamNumber = 24566456464564L;
        System.out.println(iteamNumber);



        //liczby zmienno przecinkowe
        //float - 4
        //double - 8
        // domyślne Liczby zmiennoprzecinkowe traktowane są jako double

        double a = 34.35;
        float f = 15.45F;
        System.out.println(f);

        //typ znakowy
        System.out.println('a');
        System.out.println('\'');  // znak '
        System.out.println('\t');  // tabulacja

        char d = 64;
        System.out.println(d);
        System.out.println((int)d );  // zamiana char na int

        // typy logiczne
        System.out.println(true);

        boolean choosen =true;
        boolean q = false;
        System.out.println(q);

        //ciągi znaków

        String name = "Ala";
        System.out.println(name);
        System.out.println("cześć jestem " + name);

        System.out.println();
        System.out.println(" " + 1 + 2 +"tekst");
    }

}
