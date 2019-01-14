package com.itheima.ssm.controller;


import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {


    @Autowired
    public IProductService productService;

    /**
     * 添加产品
     * @param product
     * @throws Exception
     */
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }




    /**
     * 查询全部产品
     * @return
     * @throws Exception
     */
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> ps = productService.findAll();
        mv.addObject("productList",ps);
        mv.setViewName("product-list");
        return mv;
    }
}
