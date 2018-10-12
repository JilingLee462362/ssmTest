import com.tzhu.ssm.domain.Guanggao;
import com.tzhu.ssm.service.GuanggaoBizI;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试mybatis和spring整合 mysql配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {

    //import org.apache.log4j.Logger;
    private static Logger log = Logger.getLogger(TestMybatis.class);


    @Resource
    private GuanggaoBizI guanggaoBizI;

    @Test
    public void test1() {

        List<Guanggao> guanggaoList = guanggaoBizI.search();
        for (Guanggao guanggao : guanggaoList) {
            //日志输出的级别有五个

            log.info("guanggao:   " + guanggao.toString());

        }


    }


}




