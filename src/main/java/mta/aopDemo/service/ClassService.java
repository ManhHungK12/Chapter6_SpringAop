package mta.aopDemo.service;

import mta.aopDemo.dao.ClassDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClassService {
    private Logger logger = LoggerFactory.getLogger(ClassService.class);
    @Autowired
    ClassDAO classDAO;
    public String callDaoSuccess(){
        logger.info("Test Service callDaoSuccess ");
        return classDAO.callDaoSuccess();
    }
    public String callDaoFailed(){
        logger.info("Test Service callDaoFailed");
        return classDAO.callDaoThrowException();
    }
    public String callDaoTrackTime(){
        logger.info("Test Service callDaoTrackTime");
        return classDAO.callMethodTrackTime();
    }
}
