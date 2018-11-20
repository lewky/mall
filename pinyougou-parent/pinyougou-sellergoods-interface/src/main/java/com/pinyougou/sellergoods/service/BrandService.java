// Copyright (c) 2018-2018 Lewis.Liu Limited. All rights reserved.
// Contact with me on Github - https://github.com/lewky
// ============================================================================
// CURRENT VERSION pinyougou-sellergoods-interface.1.0.0
// ============================================================================
// CHANGE LOG
// pinyougou-sellergoods-interface.1.0.0 : 2018-10-17, Lewis.Liu created
// ============================================================================
package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.dto.PageResult;
import com.pinyougou.pojo.Brand;

/**
 * 商家品牌服务接口
 * @author Lewis.Liu
 *
 */
public interface BrandService {

    List<Brand> findAll();

    /**
     * 分页查询所有
     * @param pageNum 当前页码
     * @param pageSize 每页记录数
     * @return
     */
    PageResult<Brand> findAllByPage(int pageNum, int pageSize);

    /**
     * 添加一个
     * @param brand
     */
    void addOne(Brand brand);

    /**
     * 查找一个
     * @param id
     * @return
     */
    Brand findOne(Long id);

    /**
     * 修改一个
     * @param brand
     */
    void updateOne(Brand brand);

    /**
     * 删除一个或多个
     * @param ids
     */
    void delete(Long... ids);

    /**
     * 分页条件查询
     * @param brand
     * @param pageNum
     * @param pageSize
     */
    PageResult<Brand> findByPage(Brand brand, int pageNum, int pageSize);
}
