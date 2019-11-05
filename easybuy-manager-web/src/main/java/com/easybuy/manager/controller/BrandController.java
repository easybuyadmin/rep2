package com.easybuy.manager.controller;
import java.util.List;

import com.easybuy.pojo.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.easybuy.pojo.TbBrand;
import com.easybuy.sellergoods.service.BrandService;
/**
 * 品牌controller
 * @author Administrator
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandService brandService;
    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        System.out.println(123445);
        return brandService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult  findPage(int page,int  rows){
        return  brandService.findPage(page,rows);

    }


    @RequestMapping("/findOne")
    public TbBrand  findOne(int id){
        System.out.println("-----------------------"+id);
        return null;
    }

}