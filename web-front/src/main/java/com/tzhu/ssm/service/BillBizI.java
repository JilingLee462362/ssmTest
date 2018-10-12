package com.tzhu.ssm.service;

import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.domain.SmbmsBillExample;

import java.util.List;

/**
 * Created by Administrator on 2018/10/9.
 */
public interface BillBizI {
    /**
     * 分页查询
     */
    List<SmbmsBill> selectBill(int pageNum, int pageSize);

    /**
     * 查找所有
     */
    List<SmbmsBill> selectAll();

    /**
     * 删除 通过id
     */
    void deleteBill(int id);

    /**
     * 增加
     */
    void addBill(SmbmsBill bill);

    /**
     * 修改
     */
    void updateBill(SmbmsBill bill, SmbmsBillExample example);


}
