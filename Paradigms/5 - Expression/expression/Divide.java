package expression;

/**
 * @author Nikita Kochetkov M3134
 */

public class Divide extends AbstractMultyOperation {
    public Divide(CommonExpression leftArgument, CommonExpression rightArgument) {
        super(leftArgument, rightArgument);
    }

    protected double calc(double left,double right) {
        return left / right;
    }

    protected int calc(int left,int right) {
        return left / right;
    }
}
