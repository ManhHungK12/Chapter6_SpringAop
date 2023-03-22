package mta.aopDemo.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ClassDAO {
    private final Logger logger    = LoggerFactory.getLogger(ClassDAO.class);
    public String callDaoSuccess(){
        logger.info("callDaoSuccess is called");
        return "dao1";
    }
    public String callDaoThrowException(){
        logger.info("DAO is called");
        throw new RuntimeException("");
    }
    public String callMethodTrackTime(){
        logger.info("callDaoSuccess is called");
        return "dao1";
    }
}
