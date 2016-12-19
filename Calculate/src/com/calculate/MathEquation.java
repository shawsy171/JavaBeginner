package com.calculate;

/**
 * Created by martin on 28/11/16.
 */

class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    void setLeftVal (double LeftVal) {
        this.leftVal = LeftVal;
    }

    public double getLeftVal () {
        return this.leftVal;
    }

    void setRightVal (double RightVal) {
        this.rightVal = RightVal;
    }

    public double getRightVal () {
        return this.rightVal;
    }

    void setOpCode (char opCode) {
        this.opCode = opCode;
    }

    public char getOpCode () {
        return opCode;
    }

    double getResult () {
        return result;
    }

    public MathEquation () {}

    public MathEquation (char opCode) {
        this.opCode = opCode;
    }

    public MathEquation (char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute (double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }


    void execute () {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error in the opcode");
                result =  0.0d;
                break;
        }
    }

}
