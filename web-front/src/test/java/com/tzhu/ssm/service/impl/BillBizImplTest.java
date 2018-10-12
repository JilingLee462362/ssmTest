package com.tzhu.ssm.service.impl;


import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.domain.SmbmsBillExample;
import com.tzhu.ssm.service.BillBizI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/10/9.
 */
public class BillBizImplTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    BillBizI billBizI = (BillBizI) context.getBean("billBizI");


    @Test
    public void testSelectBill() throws Exception {
        List<SmbmsBill> smbmsBills = billBizI.selectBill(2, 5);
        for (SmbmsBill sb : smbmsBills) {
            System.out.println(sb.toString());
        }

    }

    @Test
    public void testSelectAll() throws Exception {
        List<SmbmsBill> smbmsBills = billBizI.selectAll();
        for (SmbmsBill sb : smbmsBills) {
            System.out.println(sb.toString());
        }
    }

    @Test
    public void testDeleteBill() throws Exception {
        billBizI.deleteBill(10);
    }

    @Test
    public void testAddBill() throws Exception {
        billBizI.addBill(new SmbmsBill());

    }

    @Test
    public void testUpdateBill() throws Exception {
        SmbmsBill b = new SmbmsBill();
        b.setId(15);
        b.setBillcode("12123132");

        SmbmsBillExample e = new SmbmsBillExample();
        e.createCriteria().andIdEqualTo(15);
        billBizI.updateBill(b, e);

    }
}