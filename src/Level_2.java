public class Level_2 {

//    Modularization
//    Reuse the created functions and create test cases which call them with various input to achieve the best coverage
//    using black-box and white-box techniques. Extract the functions into their own module.
//    Techniques worth considering: BVA, EP, MC/DC

//            Calculator
//    Create a program which takes two numbers as input and then calculates the results of the 4 basic operands(+, -, *, /).
//    Create separate functions for the 4 operands and use them in a modular fashion.

    public static double calculatorAdd(double x, double y){
        return x+y;
    }

    public static double calculatorSubtract(double x, double y){
        return x-y;
    }

    public static double calculatorMultiply(double x, double y){
        return x*y;
    }

    public static double calculatorDivide(double x, double y){
        return x/y;
    }


}
