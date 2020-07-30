EthworksTask

1. Clone project and open it with IntelliJ.
2. Run AddAndPrintExpression class.

To change input you neeed to change variables in main function. 
For example:

exp1 = 3x^2 + x^2 + 5x^4 + x + 3x^6 - 3x^5 + 3x

exp2 = 3x^2 + x^6 + 5x^9 + 88 + x^44

are:

Expression exp1 = new Expression(Arrays.asList(3.0, 1.0, 5.0, 1.0, 3.0, -3.0, 3.0), Arrays.asList(2.0, 2.0, 4.0, 1.0, 6.0, 5.0, 1.0));

Expression exp2 = new Expression(Arrays.asList(3.0, 1.0, 5.0, 88.0, 1.0), Arrays.asList(2.0, 6.0, 9.0, 0.0, 44.0));

so first list in Expression are constants and second list are corresponding exponents. They both need to be double type.

You can also run tests (tests folder).
