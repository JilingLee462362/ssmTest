package com.tzhu.ssm.controller;

import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.service.BillBizI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
@Controller
@RequestMapping("bill")
public class BillController {

    @Autowired
    BillBizI billBizI;

    @RequestMapping("searchAll")
    public ModelAndView searchAll() {

        List<SmbmsBill> billList = billBizI.selectAll();

        ModelAndView m = new ModelAndView("bill");
        m.addObject("billList", billList);


        return m;
    }

}
