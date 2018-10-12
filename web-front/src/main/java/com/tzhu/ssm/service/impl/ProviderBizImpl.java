package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.dao.SmbmsProviderMapper;
import com.tzhu.ssm.domain.SmbmsProvider;
import com.tzhu.ssm.domain.SmbmsProviderExample;
import com.tzhu.ssm.service.ProviderBizI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/10/9.
 */
@Service(value = "providerBizI")
public class ProviderBizImpl implements ProviderBizI {
    SmbmsProviderMapper smbmsProviderMapper;

    @Resource
    public void setSmbmsProviderMapper(SmbmsProviderMapper smbmsProviderMapper) {
        this.smbmsProviderMapper = smbmsProviderMapper;
    }

    @Override
    public void addProvider(SmbmsProvider p) {
        smbmsProviderMapper.insert(p);
    }

    @Override
    public void deleteProvider(int id) {
        smbmsProviderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SmbmsProvider selectProvider(int id) {
        SmbmsProvider smbmsProvider = smbmsProviderMapper.selectByPrimaryKey(id);
        return smbmsProvider;
    }

    @Override
    public void updateProvider(SmbmsProvider p, SmbmsProviderExample providerExample) {

        smbmsProviderMapper.updateByExample(p, providerExample);


    }
}
