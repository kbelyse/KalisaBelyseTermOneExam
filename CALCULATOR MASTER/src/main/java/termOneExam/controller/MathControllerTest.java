package rw.ac.rca.termOneExam.controller;


import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.json.JSONException;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import rw.ac.rca.termOneExam.dto.DoMathRequest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    public void calculate_success() throws JSONException {

        //create domath dto
        DoMathRequest request = new DoMathRequest();
        request.setOperand1(10);
        request.setOperand2(5);
        request.setOperation("+");

        ResponseEntity<Integer> response = this.restTemplate.postForEntity("/api/calculator/calculate", request, Integer.class);
        assertEquals(200, response.getStatusCodeValue());
//        assertEquals(15, response.getBody());
    }
}
