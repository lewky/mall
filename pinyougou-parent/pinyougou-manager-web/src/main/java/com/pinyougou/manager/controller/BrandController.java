// Copyright (c) 2018-2018 Lewis.Liu Limited. All rights reserved.
// Contact with me on Github - https://github.com/lewky
// ============================================================================
// CURRENT VERSION pinyougou-manager-web.1.0.0
// ============================================================================
// CHANGE LOG
// pinyougou-manager-web.1.0.0 : 2018-10-17, Lewis.Liu created
// ============================================================================
package com.pinyougou.manager.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.dto.ExecutionResult;
import com.pinyougou.dto.PageResult;
import com.pinyougou.pojo.Brand;
import com.pinyougou.sellergoods.service.BrandService;

/**
 * 商家品牌控制器
 * @author Lewis.Liu
 *
 */
@RestController
public class BrandController {
    private static final Logger log = Logger.getLogger(BrandController.class);

    @Reference
    private BrandService brandService;

    /**
     * 分页查询所有<br>
     * @deprecated
     * replaced by <code>findByPage()</code>.
     * @param page
     * @param pageSize
     * @return
     */
    @Deprecated
    @RequestMapping(value = "/brands/all", method = RequestMethod.GET)
    public PageResult<Brand> findAllByPage(@RequestParam(value = "page", defaultValue = "1") final int page,
            @RequestParam(value = "page_size", defaultValue = "10") final int pageSize) {
        return brandService.findAllByPage(page, pageSize);
    }

    /**
     * 添加一个
     * @param brand
     * @return
     */
    @RequestMapping(value = "/brands", method = RequestMethod.POST)
    public ExecutionResult addOne(@RequestBody final Brand brand) {
        try {
            brandService.addOne(brand);
            return new ExecutionResult(true, "添加成功");
        } catch (final Exception e) {
            log.error("添加失败！", e);
            return new ExecutionResult(false, "添加失败");
        }
    }

    /**
     * 查询一个
     * @param id
     * @return
     */
    @RequestMapping(value = "/brands/{id}", method = RequestMethod.GET)
    public Brand findOne(@PathVariable("id") final Long id) {
        return brandService.findOne(id);
    }

    /**
     * 修改一个
     * @param brand
     * @return
     */
    @RequestMapping(value = "/brands", method = RequestMethod.PUT)
    public ExecutionResult updateOne(@RequestBody final Brand brand) {
        try {
            brandService.updateOne(brand);
            return new ExecutionResult(true, "修改成功");
        } catch (final Exception e) {
            log.error("修改失败！", e);
            return new ExecutionResult(false, "修改失败");
        }
    }

    /**
     * 删除一个或多个
     * @param ids
     * @return
     */
    @RequestMapping(value = "/brands/{ids}", method = RequestMethod.DELETE)
    public ExecutionResult delete(@PathVariable("ids") final Long... ids) {
        try {
            brandService.delete(ids);
            return new ExecutionResult(true, "删除成功");
        } catch (final Exception e) {
            log.error("删除失败！", e);
            return new ExecutionResult(false, "删除失败");
        }
    }

    /**
     * 分页条件查询，若条件(brand)为空则查询所有
     * @param brand
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/brands", method = RequestMethod.GET)
    public PageResult<Brand> findByPage(@RequestParam(value = "entity", defaultValue = "") final Brand brand,
            @RequestParam(value = "page", defaultValue = "1") final int page,
            @RequestParam(value = "page_size", defaultValue = "10") final int pageSize) {
        if (brand == null) {
            return null;
        }
        return brandService.findByPage(brand, page, pageSize);
    }
}
