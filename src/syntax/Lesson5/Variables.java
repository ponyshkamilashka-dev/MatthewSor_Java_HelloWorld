package syntax.Lesson5;


public class Variables {

    static void main(String[] args) {
        //byte= -128...127
        //0 0 0 0 0 0 0 0
        byte age= 100;

        //Short= -32768...32767

        short ShortNumber= 500;

        // int (-2 billion...2 billion)
        int IntNumber= 500000;

        // long= 8 bytes
        long LongNumber= 99999999999999999L;

        // float= 4 bytes
        float FloatNumber= 3.14f;

        // double= 8 bytes
        double DoubleNumber= 5.78;

        char CharSymbol='C';

        boolean BoolVariable= false;
        boolean BoolVarF= true;

        var Figushki= 200L;

        System.out.println("Byte: "+age);
        System.out.println("Short: "+ShortNumber);
        System.out.println("Int: "+IntNumber);
        System.out.println("Long: "+LongNumber);
        System.out.println("Float: "+FloatNumber);
        System.out.println("Double: "+DoubleNumber);

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.isNaN(1000/0.0));
        System.out.println(Double.isNaN(1000/10.0));

        System.out.println("Char: "+CharSymbol);

        System.out.println(BoolVariable);
        System.out.println(BoolVarF);

        System.out.println(Figushki);

        short L1, L2;
        L1 = 20;
        L2 = 30;

        System.out.println(L1);
        System.out.println(L2);

        //casting
        short varAge= age;
        System.out.println(varAge);

        int Int_varAge= varAge;
        System.out.println(Int_varAge);

        int BadCasting= -32768;
        byte ByteVeryBad=(byte) BadCasting;


    }

}
