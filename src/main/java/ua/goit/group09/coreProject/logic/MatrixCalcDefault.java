package ua.goit.group09.coreProject.logic;

import ua.goit.group09.coreProject.data.Matrix;

/**
 * Class with invoke given operation with matrices
 */
public class MatrixCalcDefault implements MatrixCalc {

    /**
     * makes given math operation with to given matrices or matrix #1 and number
     * @param mathOperation     type of math operation (sum, subtract, multiply)
     * @param matrix1           first matrix to be operated
     * @param matrix2           second matrix to be operated (if it's needed to given type of math operation)
     * @return                  result of given operation
     */
    @Override
    public Matrix makeOperation(MathOperation mathOperation, Matrix matrix1, Matrix matrix2) {
        EvaluatorFactory factory = new EvaluatorFactory();
        Evaluator evaluator = factory.getEvaluator(mathOperation);
        return evaluator.evaluate(mathOperation, matrix1, matrix2);
    }
}
