package test;

import com.alibaba.fastjson.JSON;
import com.muc_village.pojo.sw_architectureInfo;
import com.muc_village.service.sw_VillageServiceImpl;
import com.muc_village.service.sw_architectureServiceImpl;
import org.junit.Test;
import com.muc_village.pojo.sw_VillageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Logger;

public class TestUnit extends baseTest {

    private static Logger logger = Logger.getLogger(String.valueOf(TestUnit.class));
    @Autowired
    private sw_architectureServiceImpl sw_architectureService;



    @Test
    public void testget() {
        sw_architectureInfo sw=new sw_architectureInfo();
        sw=sw_architectureService.getContent(1);

        logger.info(JSON.toJSONString(sw));

    }
}
