package mta.aopDemo;

import mta.aopDemo.service.ClassService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringAopApplicationTests {
    @Autowired
    ClassService classService;
    @Test
    void callTestService() {
       classService.callDaoSuccess();
//        try {
//            testService.callDaoFailed();
//        } catch (Exception ex) {
//
//        }

   //     testService.callDaoTrackTime();

    }
}
