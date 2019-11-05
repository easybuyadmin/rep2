package com.easybuy.sellergoods.service;

import com.easybuy.pojo.PageResult;
import com.easybuy.pojo.TbBrand;

import java.util.List;

/**
 * 品牌服务层接口
 * @author Administrator
 *
 */
public interface BrandService {
    /**
     * 返回全部列表
     * @return
     */
    public List<TbBrand> findAll();

    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);
}