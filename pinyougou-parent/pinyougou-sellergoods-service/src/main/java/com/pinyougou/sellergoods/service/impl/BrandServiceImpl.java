// Copyright (c) 2018-2018 Lewis.Liu Limited. All rights reserved.
// Contact with me on Github - https://github.com/lewky
// ============================================================================
// CURRENT VERSION pinyougou-sellergoods-service.1.0.0
// ============================================================================
// CHANGE LOG
// pinyougou-sellergoods-service.1.0.0 : 2018-10-17, Lewis.Liu created
// ============================================================================
package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.dto.PageResult;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.Brand;
import com.pinyougou.pojo.BrandExample;
import com.pinyougou.pojo.BrandExample.Criteria;
import com.pinyougou.sellergoods.service.BrandService;

/**
 * 商家品牌服务
 * @author Lewis.Liu
 *
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /* (non-Javadoc)
     * @see com.pinyougou.sellergoods.service.BrandService#findAll()
     */
    @Override
    public List<Brand> findAll() {
        // 返回全部的Brand
        return brandMapper.selectByExample(null);
    }

    /* (non-Javadoc)
     * @see com.pinyougou.sellergoods.service.BrandService#findByPage(int, int)
     */
    @Override
    public PageResult<Brand> findAllByPage(final int pageNum, final int pageSize) {
        // PageHelper分页插件
        PageHelper.startPage(pageNum, pageSize);
        final Page<Brand> page = (Page<Brand>) brandMapper.selectByExample(null);

        return new PageResult<Brand>(page.getTotal(), page.getResult());
    }

    /* (non-Javadoc)
     * @see com.pinyougou.sellergoods.service.BrandService#add(com.pinyougou.pojo.Brand)
     */
    @Override
    public void addOne(final Brand brand) {
        brandMapper.insert(brand);
    }

    /* (non-Javadoc)
     * @see com.pinyougou.sellergoods.service.BrandService#findOne(java.lang.Long)
     */
    @Override
    public Brand findOne(final Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc)
     * @see com.pinyougou.sellergoods.service.BrandService#update(com.pinyougou.pojo.Brand)
     */
    @Override
    public void updateOne(final Brand brand) {
        brandMapper.updateByPrimaryKey(brand);
    }

    /* (non-Javadoc)
     * @see com.pinyougou.sellergoods.service.BrandService#delete(java.lang.Long[])
     */
    @Override
    public void delete(final Long... ids) {
        for (final Long id : ids) {
            brandMapper.deleteByPrimaryKey(id);
        }
    }

    /* (non-Javadoc)
     * @see com.pinyougou.sellergoods.service.BrandService#findByPage(com.pinyougou.pojo.Brand, int, int)
     */
    @Override
    public PageResult<Brand> findByPage(final Brand brand, final int pageNum, final int pageSize) {
        PageHelper.startPage(pageNum, pageSize); // 分页
        final BrandExample example = new BrandExample();
        final Criteria criteria = example.createCriteria();
        final String name = brand.getName();
        final String firstChar = brand.getFirstChar();
        if (StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (StringUtils.isEmpty(firstChar)) {
            criteria.andFirstCharLike("%" + firstChar + "%");
        }
        final Page<Brand> page = (Page<Brand>) brandMapper.selectByExample(example);

        return new PageResult<Brand>(page.getTotal(), page.getResult());
    }
}
