package ua.od.hillel;

public class DataTypes {

    /**
     *  boolean
     *  =====
     *  byte    8  бит    от -128 до 127
     *  short    16 бит    от -32768 до 32767
     *  char    16 бит    беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
     *  int    32 бит    от -2147483648 до 2147483647
     *  long    64 бит    от -9223372036854775808 до 9223372036854775807
     *  =====
     *  float    32 бит    от -1.4e-45f до 3.4e+38f
     *  double    64 бит    от -4.9e-324 до 1.7e+308
     */
    public static void main(String[] args) {
        System.out.println(Boolean.TYPE + " " + Boolean.FALSE + " " + Boolean.TRUE);
        System.out.println(Byte.TYPE + " " + Byte.SIZE + " от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println(Character.TYPE + " " + Character.SIZE + " от " + Character.MIN_VALUE + " до " + Character.MAX_VALUE);
        System.out.println(Integer.TYPE + " " + Integer.SIZE + " от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println(Long.TYPE + " " + Long.SIZE + " от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println(Float.TYPE + " " + Float.SIZE + " от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println(Double.TYPE + " " + Double.SIZE + " от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
    }
}