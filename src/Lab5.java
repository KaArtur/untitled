public class Lab5 {
    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("Program 1");
        System.out.println("----------");
        double invest = 14000;
        double afterYear=invest*1.4;
        double afterTwoYear=afterYear-1500;
        double afterThreeYear = afterTwoYear*1.12;
        System.out.println("Po roku: " + afterYear);
        System.out.println("Po 2 latach: " + afterTwoYear);
        System.out.println("Po 3 latach: " + afterThreeYear);

        System.out.println("---------------");
        System.out.println("Program drugi");
        System.out.println("---------");
//        boolean c;
        int a =35;

//        if((a%7==0)&&(a%5==0)) System.out.println(c=true);
        boolean result = (a%5)==00 &&(a%7)==0;
        System.out.println("Czy liczba " + a + " dzieli się przez 5 i 7 jendoczesnie? - " + result );

        System.out.println("---------------");
        System.out.println("Program trzeci");
        System.out.println("---------");

        int i = 5;
        int n =2;
        int mask = 1<<n-1;
        boolean result2 = (i & mask)>0;

        System.out.println("Dla liczby " + i +" na " + n + " pozycji znajduje się bit: " + result2);

        System.out.println(String.format("%32s", Integer.toBinaryString(i)).replace(' ', '0'));
    }
}
