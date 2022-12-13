package rw.ac.rca.termOneExam.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import rw.ac.rca.termOneExam.dto.DoMathRequest;
import rw.ac.rca.termOneExam.serviceImpl.MathOperatorImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class MathOperatorImplTest {

    @InjectMocks
    private MathOperatorImpl mathOperator;

    @Test
    public void doMath() {

        assertEquals(10,mathOperator.doMath(new DoMathRequest(5,5,"+")));
        assertEquals(10,mathOperator.doMath(new DoMathRequest(15,5,"-")));
        assertEquals(10,mathOperator.doMath(new DoMathRequest(5,2,"*")));
        assertEquals(10,mathOperator.doMath(new DoMathRequest(100,10,"/")));

    }

}
