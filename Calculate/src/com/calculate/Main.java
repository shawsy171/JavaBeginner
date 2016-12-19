package com.calculate;

/**
 * Created by martin on 28/11/16.
 */
public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        double leftVal = 5.6;
        double rightVal = 7.0;
        MathEquation secondEq = new MathEquation('m');
        secondEq.execute(leftVal, rightVal);
//        secondEq.execute(3.0, 6.0);
        System.out.print("---------\n");
        System.out.print("result = ");
        System.out.println(secondEq.getResult());
    }
}
