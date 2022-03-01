package q3;

/**
 * MIX char.
 *
 * @author Alex Wong
 * @version April 12, 2021.
 */
public final class MIXChar {
    /** holds delta. */
    private static final char DELTA = '\u0394';

    /** holds SIGMA. */
    private static final char SIGMA = '\u03A3';

    /** holds PI. */
    private static final char PI = '\u03A0';

    /** number of MIX characters from graph 0 - 55. */
    private static final int NUMBERMIXCHAR = 56;

    /** array holding all the char. */
    private static final char[] CHARLIST = new char[NUMBERMIXCHAR];

    /** Holding the value of MIX character. */
    private int value;

    /**
     * Sets its value for a MIXChar object.
     * 
     * @param value is value of MIXChar
     */
    public MIXChar(int value) {
        this.value = value;
    }

    /** mixChar constructor.
     * @param c converts the char.
     */
    public MIXChar(char c) {
        if (isMIXChar(c)) {
            for (int i = 0; i < CHARLIST.length; i++) {
                if (c == CHARLIST[i]) {
                    value = i;
                    break;
                }
            }
        } else {
            throw new IllegalArgumentException("The char is not a MIXChar!");
        }
    }
    



    /**
     * Checks if the character is MIX character.
     * 
     * @param c a char.
     * @return result.
     */
    static boolean isMIXChar(char c) {
        boolean result = false;
        for (char temp : CHARLIST) {
            if (c == temp) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Returns the character of a MIXChar object.
     * 
     * @param x a MIXChar object.
     * @return char The character
     */
    static char toChar(MIXChar x) {
        return CHARLIST[x.ordinal()];
    }

    /**
     * Returns a String of a MIXChar array.
     * 
     * @param array a MIXChar array.
     * @return String of the array.
     */
    static String toString(MIXChar[] array) {
        
        
        String result = "";
        for (MIXChar temp : array) {
            result = result + toChar(temp);
        }
        return result;

    }


    /**
     * Encodes a MIXChar array.
     * 
     * @param m a MIXChar array.
     * @return long[] array.
     */
    static long[] encode(MIXChar[] m) {
        final int digits = 11;
        long[] result = new long[(int) Math.ceil((double) m.length / digits)];

        int j = 0;
        int digit = 0;
        for (int i = 0; i < m.length; i++) {
            result[j] = result[j] + (long) m[i].ordinal() 
                    *  (long) Math.pow(NUMBERMIXCHAR, digit);
            digit++;
            if (i % digits == digits - 1) {
                j++;
                digit = 0;
            }
        }
        return result;

    }

    /**
     * Decodes a long array.
     * 
     * @param l a long array.
     * @return MIXChar[] array.
     */
    static MIXChar[] decode(long[] l) {
        final int digits = 11;
        MIXChar[] result = new MIXChar[l.length * digits];
        int m = 0;
        long number;
        
        
        for (int i = 0; i < l.length; i++) {
            number = l[i];
            for (int k = 0; k < digits; k++) {
                result[m] = new MIXChar((int) 
                        (Long.remainderUnsigned(number, NUMBERMIXCHAR)));
                number = Long.divideUnsigned(number, NUMBERMIXCHAR);
                m++;
            }

        }
        return result;
    }
    
    /**
     * returns numerical value of this MIXChar.
     * @return int value.
     */
    public int ordinal() {
        return value;
    }

    /**
     * returns string containing this MIXChar as a Java char.
     * 
     * @return String The String
     */
    public String toString() {
        return "" + toChar(this);
    }

}
