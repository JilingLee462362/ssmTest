package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.domain.SmbmsProvider;
import com.tzhu.ssm.domain.SmbmsProviderExample;
import com.tzhu.ssm.service.ProviderBizI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/10/9.
 */
public class ProviderBizImplTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    ProviderBizI providerBizI = (ProviderBizI) context.getBean("providerBizI");

    /**
     * 测试增加
     *
     * @throws Exception
     */
    @Test
    public void testAddProvider() throws Exception {

        providerBizI.addProvider(new SmbmsProvider());
    }

    /**
     * 测试删除
     *
     * @throws Exception
     */
    @Test
    public void testDeleteProvider() throws Exception {
        providerBizI.deleteProvider(16);

    }

    /**
     * 测试查询
     *
     * @throws Exception
     */
    @Test
    public void testSelectProvider() throws Exception {
        SmbmsProvider smbmsProvider = providerBizI.selectProvider(15);
        System.out.println(smbmsProvider);
    }

    /**
     * 测试修改
     *
     * @throws Exception
     */
    @Test
    public void testUpdateProvider() throws Exception {

        SmbmsProvider p = new SmbmsProvider();
        p.setId(17);
        p.setProcode("123123");

        SmbmsProviderExample providerExample = new SmbmsProviderExample();
        providerExample.createCriteria().andIdEqualTo(17);

        providerBizI.updateProvider(p, providerExample);
    }
}