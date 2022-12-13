package rw.ac.rca.termOneExam.serviceImpl;

import org.springframework.stereotype.Service;
import rw.ac.rca.termOneExam.dto.DoMathRequest;
import rw.ac.rca.termOneExam.service.MathOperator;

@Service
public class MathOperatorImpl implements MathOperator {
    @Override
    public Integer doMath(DoMathRequest request) {
        Integer result = null;
        switch (request.getOperation()) {
            case "+":
                result = request.getOperand1() + request.getOperand2();
                break;
            case "-":
                result = request.getOperand1() - request.getOperand2();
                break;
            case "*":
                result = request.getOperand1() * request.getOperand2();
                break;
            case "/":
                result = request.getOperand1() / request.getOperand2();
                break;
            case "%":
                result = request.getOperand1() % request.getOperand2();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
        return result;
    }
}

