/**
 * @author Аполоник Данила
 * @version 1.0
 *
 * */
package com.company;

import by.belstu.it.apolonik.TextFunction;

import java.nio.charset.StandardCharsets;
import java.sql.Wrapper;

import static java.lang.Math.*;

import static java.lang.Math.log;

public class Main {
    static int sint;

    final int c1 = 1;
    public final int c2 = 2;
    public static final int c3 = 3;

    /**
     * <meta charset="utf-8"/>
     * @returns Exit code (int)
     * @throws Exception
     * @param  String[] args - arguments' array from console
     * */
    public static void main(String[] args) {
        extractedMethod();
        //================================================
        String strv = "string";
        char cv = 'x';
        int iv = 232131;
        short sv = 125;
        byte bv = 11;
        long lv = -4617831;
        boolean boolv = true;
        double dv = -414.3;
        System.out.println(strv + iv);
        System.out.println(strv + cv);
        System.out.println(strv + 175.31);
        bv = (byte) (iv + bv);
        System.out.println(bv);
        System.out.println(iv = (((int) (dv + lv))));
        System.out.println(lv = (iv +  2147483647));
        System.out.println(sint);
        System.out.println(boolv = boolv && boolv);
        System.out.println(boolv = boolv ^ boolv);
        //System.out.println(boolv  + boolv);
        long v1 = 9223372036854775807L;
        long v2 = 0x7fff_ffff_fffL;
        System.out.println(cv = 'a');
        System.out.println(cv = '\u0061');
        System.out.println(cv = 97);
        cv = 'a' + '\u0061' + 97;
        System.out.println( 3.45 % 2.4 );
        System.out.println(1.0/0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));

        System.out.println(PI + " " + E);
        System.out.println(round(PI) + " " + round(E));
        System.out.println(min(PI, E));
        System.out.println(Math.random());

        Integer Iv = iv;
        Boolean Boolv = boolv;
        Character Cv = cv;
        Byte Bv = bv;
        Short Sv = sv;
        Long Lv = lv;
        Double Dv = dv;
        System.out.println(Iv << 3);
        System.out.println(Lv*sv);
        System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE + " " + Double.MIN_VALUE);

        // boxing / uboxing

        Integer iboxed = 3;
        int iunboxed = iboxed.intValue();

        Byte bboxed = 1;
        byte bunboxed = bboxed.byteValue();

        System.out.println(Integer.parseInt("32"));
        System.out.println(Integer.toHexString(31312321));
        System.out.println(Integer.compare(3, 5));
        System.out.println(Integer.toString(321));
        System.out.println(Integer.bitCount(31));

        String intStr = "2345";
        System.out.println(Integer.valueOf(intStr).toString()+" "+Integer.parseInt(intStr));
        byte[] byteArr = intStr.getBytes();
        System.out.println(byteArr);
        System.out.println(new String(byteArr));

        System.out.println(Boolean.parseBoolean(intStr) + Boolean.valueOf(intStr).toString());

        String str1 = "Hello, Java!";
        String str2 = "Hello, Java!";
        System.out.println((str1==str2) + " " + str1.equals(str2) + " " + str2.compareTo(str1));

        str1 = null;
        //System.out.println((str1==str2) + " " + str2.equals(str1) + " " + str2.compareTo(str1));

        String strToCut = "This is some king of a string, that will be splited, set on fire and so on! Good Luck, string!";
        System.out.println(strToCut.split(" ")[6]);
        System.out.println(strToCut.contains("string"));
        System.out.println(strToCut.hashCode());
        System.out.println(strToCut.indexOf('i'));
        System.out.println(strToCut.length());
        System.out.println(strToCut.replace(' ', '?'));

        char[][] c1 = new char[3][];
        char[] c2[] = {{'a', 'b', 'c'}, {'a','b'}};
        char c3[][] = {{'a', 'b', 'c'}, {'a','b', 'c', 'd'}};

        System.out.println(c1.length);
        for(int i = 0, j = c1.length; i<c1.length;i++)
        {
            c1[i] = new char[++j];
            System.out.println(c1[i].length);
        }

        boolean comRez = c2 == c3;
        c2 = c3;
        for (char[] el:c2
             ) {
            for (char cel: el)
            {
                System.out.print(cel + " ");
            }
            System.out.println();
        }

        WrapperString temp = new WrapperString("sttttr");
        temp.replace('t', '!');
        System.out.println(temp);

        WrapperString overrided = new WrapperString("Some Text") {
            @Override
            public void replace(char oldchar, char newchar) {
                this.strvalue = this.strvalue.replace(newchar, oldchar);
            }

            public WrapperString delete(char delchar)
            {
                String newStr = "";
                for(int i = 0; i < strvalue.length(); i++)
                {
                    if(strvalue.charAt(i) !=delchar)
                    {
                        newStr+=strvalue.charAt(i);
                    }
                }
                this.setStrvalue(newStr);
                return this;
            }
        }.delete('e');
        overrided.replace('_',' ');
        System.out.println(overrided.toString());
    }

    private static void extractedMethod() {
        TextFunction tf = new TextFunction();
        System.out.println(tf.getValue());
    }
}