package test;

import com.alibaba.fastjson.JSON;
import com.muc.pojo.UserInfo;
import com.muc.service.UserServiceImpl;
import com.muc_village.pojo.sw_architectureInfo;
import com.muc_village.service.sw_architectureServiceImpl;
import com.mysql.operation.DbcontextHolder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.logging.Logger;

public class TestUnit extends baseTest {

    private static Logger logger = Logger.getLogger(String.valueOf(TestUnit.class));
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private sw_architectureServiceImpl sw_architectureService;



    @Test
    public void testget() {
        DbcontextHolder.setDbType("dataSourcemuc_village");
        ArrayList<sw_architectureInfo> sw=sw_architectureService.getContent1("11");

        logger.info(JSON.toJSONString(sw));

    }
}
