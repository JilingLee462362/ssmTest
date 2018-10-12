package com.tzhu.ssm.service;

import com.tzhu.ssm.domain.SmbmsProvider;
import com.tzhu.ssm.domain.SmbmsProviderExample;

/**
 * Created by Administrator on 2018/10/9.
 */
public interface ProviderBizI {
    /**
     * 增加
     */
    void addProvider(SmbmsProvider p);

    /**
     * 删除
     */
    void deleteProvider(int id);

    /**
     * 查询 根据id
     */
    SmbmsProvider selectProvider(int id);

    /**
     * 修改
     */
    void updateProvider(SmbmsProvider p, SmbmsProviderExample providerExample);
}
