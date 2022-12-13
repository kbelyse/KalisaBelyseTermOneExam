package rw.ac.rca.termOneExam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rw.ac.rca.termOneExam.dto.DoMathRequest;
import rw.ac.rca.termOneExam.serviceImpl.MathOperatorImpl;

@RestController
@RequestMapping("/api/calculator")
public class MathController {

    @Autowired
    private MathOperatorImpl mathOperator;

    @PostMapping("/calculate")
    public ResponseEntity<Integer> calculate(@RequestBody DoMathRequest  request) {
        return ResponseEntity.ok(mathOperator.doMath(request));
    }

}
