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

        System.out.println("Byte: "+age);
        System.out.println("Short: "+ShortNumber);
        System.out.println("Int: "+IntNumber);
        System.out.println("Long: "+LongNumber);
        System.out.println("Float: "+FloatNumber);
        System.out.println("Double: "+DoubleNumber);


    }

}
