package cn.xj.controller;

import cn.xj.pojo.Category;
import cn.xj.pojo.Product;
import cn.xj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main")
public class Main {
    @Autowired
    ProductService productService;
    /*进入首页之前要将1级类目和2级类目的信息传进去*/
    @RequestMapping("/start")
    public String start(HttpServletRequest request){
        //得到第一级类目
        List<Product> product1s = productService.SelectFirstCategory();

        List<Category> categories = new ArrayList<>();
        //得到二级类目
        for(int i = 0;i < product1s.size();i++){
            Category category = new Category();
            category.setFather(product1s.get(i));
            List<Product> product2s= productService.SelectSecondCategory(product1s.get(i));
            category.setChildren(product2s);
            categories.add(category);
        }
        for(int i = 0;i < categories.size();i++){
            System.out.println(categories.get(i).getFather().getName());
            for(int j = 0; j < categories.get(i).getChildren().size();j++){
                System.out.println(categories.get(i).getChildren().get(j).getName());
            }
        }
        request.setAttribute("list",categories);
        return "main.jsp";
    }



}
