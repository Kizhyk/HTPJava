package com.kizhyk;

public class Task1 {

    public static void main(String[] args) {
        int a = 42;
        int b = 15;

        int c = -42;
        int d = -15;

        negation(a); //0000 0000 0000 0000 0000 0000 0010 1010 => 1111 1111 1111 1111 1111 1111 1101 0101
        negation(b); //0000 0000 0000 0000 0000 0000 0000 1111 => 1111 1111 1111 1111 1111 1111 1111 0000
        negation(c); //1111 1111 1111 1111 1111 1111 1101 0110 => 0000 0000 0000 0000 0000 0000 0010 1001
        negation(d); //1111 1111 1111 1111 1111 1111 1111 0001 => 0000 0000 0000 0000 0000 0000 0000 1110

        disjunction(a, b);
        /*0000 0000 0000 0000 0000 0000 0010 1010
         |0000 0000 0000 0000 0000 0000 0000 1111
          ---------------------------------------
          0000 0000 0000 0000 0000 0000 0010 1111
         */

        disjunction(c, d);
        /*1111 1111 1111 1111 1111 1111 1101 0110
         |1111 1111 1111 1111 1111 1111 1111 0001
          ---------------------------------------
          1111 1111 1111 1111 1111 1111 1111 0111
         */

        assignmentDisjunction(a, b);
        assignmentDisjunction(c, d);

        conjunction(a, b);
        /*0000 0000 0000 0000 0000 0000 0010 1010
         &0000 0000 0000 0000 0000 0000 0000 1111
          ---------------------------------------
          0000 0000 0000 0000 0000 0000 0000 1010
         */

        conjunction(c, d);
        /*1111 1111 1111 1111 1111 1111 1101 0110
         &1111 1111 1111 1111 1111 1111 1111 0001
          ---------------------------------------
          1111 1111 1111 1111 1111 1111 1101 0001
         */

        assignmentConjunction(a, b);
        assignmentConjunction(c, d);

        exclusiveDisjunction(a, b);
        /*0000 0000 0000 0000 0000 0000 0010 1010
         ^0000 0000 0000 0000 0000 0000 0000 1111
          ---------------------------------------
          0000 0000 0000 0000 0000 0000 0010 0101
         */

        exclusiveDisjunction(c, d);
        /*1111 1111 1111 1111 1111 1111 1101 0110
         ^1111 1111 1111 1111 1111 1111 1111 0001
          ---------------------------------------
          0000 0000 0000 0000 0000 0000 0010 0111
         */

        assignmentExclusiveDisjunction(a, b);
        assignmentExclusiveDisjunction(c, d);

        leftShift(a, b);
        /*0000 0000 0000 0000 0000 0000 0010 1010
        <<15
          ---------------------------------------
          0000 0000 0001 0101 0000 0000 0000 0000
         */

        leftShift(c, d);
        /*1111 1111 1111 1111 1111 1111 1101 0110
         <<-15
          ---------------------------------------
          1111 1111 1010 1100 0000 0000 0000 0000 (???)
         */


        assignmentLeftShift(a, b);
        assignmentLeftShift(c, d);

        rightShift(a, b);
        /*0000 0000 0000 0000 0000 0000 0010 1010
        >>15
          ---------------------------------------
          0000 0000 0000 0000 0000 0000 0000 0000
         */

        rightShift(c, d);
        /*1111 1111 1111 1111 1111 1111 1101 0110
         >>-15
          ---------------------------------------
          1111 1111 1111 1111 1111 1111 1111 1111 (???)
         */

        assignmentRightShift(a, b);
        assignmentRightShift(c, d);

        unsignedRightShift(a, b);
        /*0000 0000 0000 0000 0000 0000 0010 1010
        >>>15
          ---------------------------------------
          0000 0000 0000 0000 0000 0000 0000 0000
         */

        unsignedRightShift(c, d);
        /*1111 1111 1111 1111 1111 1111 1101 0110
         >>>-15
          ---------------------------------------
          0000 0000 0000 0000 0111 1111 1111 1111 (???)
         */

        assignmentUnsignedRightShift(a, b);
        assignmentUnsignedRightShift(c, d);

        /*try {
            System.out.println(~42.5); //java: bad operand type double for unary operator '~'
        } catch (Exception e) {
            System.out.println(e);
        }*/
    }


    public static void negation(int a) {
        System.out.printf("Negation: \n%d\n", ~a);
    }

    public static void disjunction(int a, int b) {
        System.out.printf("Disjunction: \n%d\n", a | b);
    }

    public static void assignmentDisjunction(int a, int b) {
        a |= b;
        System.out.printf("AssignmentDisjunction: \n%d\n", a);
    }

    public static void conjunction(int a, int b) {
        System.out.printf("Conjunction: \n%d\n", a & b);
    }

    public static void assignmentConjunction(int a, int b) {
        a &= b;
        System.out.printf("AssignmentConjunction: \n%d\n", a);
    }

    public static void exclusiveDisjunction(int a, int b) {
        System.out.printf("ExclusiveDisjunction: \n%d\n", a ^ b);
    }

    public static void assignmentExclusiveDisjunction(int a, int b) {
        a ^= b;
        System.out.printf("AssignmentExclusiveDisjunction: \n%d\n", a);
    }

    public static void leftShift(int a, int b) {
        System.out.printf("LeftShift: \n%d\n", a << b);
    }

    public static void assignmentLeftShift(int a, int b) {
        a <<= b;
        System.out.printf("AssignmentLeftShift: \n%d\n", a);
    }

    public static void rightShift(int a, int b) {
        System.out.printf("RightShift: \n%d\n", a >> b);
    }

    public static void assignmentRightShift(int a, int b) {
        a >>= b;
        System.out.printf("AssignmentRightShift: \n%d\n", a);
    }

    public static void unsignedRightShift(int a, int b) {
        System.out.printf("UnsignedRightShift: \n%d\n", a >>> b);
    }

    public static void assignmentUnsignedRightShift(int a, int b) {
        a >>>= b;
        System.out.printf("AssignmentUnsignedRightShift: \n%d\n", a);
    }

    /*Arrays.stream(String.format
            ("%32s", Integer.toBinaryString(32767))
            .replace(' ', '0')
                .split("(?<=\\G.{4})")).forEach(x -> System.out.print(x + " "));*/

}