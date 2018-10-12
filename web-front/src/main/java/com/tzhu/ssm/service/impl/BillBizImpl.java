package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.dao.SmbmsBillMapper;
import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.domain.SmbmsBillExample;
import com.tzhu.ssm.service.BillBizI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/10/9.
 */
@Service(value = "billBizI")
public class BillBizImpl implements BillBizI {
    @Resource
    SmbmsBillMapper billMapper;


    @Override
    public List<SmbmsBill> selectBill(int pageNum, int pageSize) {
        SmbmsBillExample example = new SmbmsBillExample();
        int turePageNum = (pageNum - 1) * pageSize;
        example.setPageNum(pageNum);
        example.setPageSize(turePageNum);
        List<SmbmsBill> smbmsBills = billMapper.selectByExample(example);
        return smbmsBills;
    }

    @Override
    public List<SmbmsBill> selectAll() {
        List<SmbmsBill> smbmsBills = billMapper.selectByExample(null);
        return smbmsBills;
    }

    @Override
    public void deleteBill(int id) {
        billMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addBill(SmbmsBill bill) {

        billMapper.insert(bill);
    }

    @Override
    public void updateBill(SmbmsBill bill, SmbmsBillExample exampl) {

        billMapper.updateByExample(bill, exampl);


    }
}
