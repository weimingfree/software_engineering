package cn.xj.controller;

import cn.xj.pojo.Product;
import cn.xj.service.ProductService;
import cn.xj.utils.FileNameUtil;
import com.github.pagehelper.PageInfo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/product")
public class product {
    @Autowired
    ProductService productService;
    private final int PAGESIZE = 5;

    /*通过搜索栏模糊查询，返回携带商品列表的第一页信息*/
    @RequestMapping("/queryProduct1")
    public String queryProduct1(HttpServletRequest request){
        PageInfo pageInfo = null;
        String name = request.getParameter("name");
        pageInfo =productService.splitPageFuzzyQuery(1,PAGESIZE,name);
        request.setAttribute("pageinfo",pageInfo);
        return "test.jsp";
    }
    /*通过搜索栏模糊查询，返回携带商品列表的其他页信息*/
    @RequestMapping("/queryProduct2")
    public String queryProduct2(HttpServletRequest request){
        PageInfo pageInfo = null;
        String name = request.getParameter("name");
        int pageNum = Integer.parseInt(request.getParameter("pageNum"));
        pageInfo =productService.splitPageFuzzyQuery(pageNum,PAGESIZE,name);
        request.setAttribute("pageinfo",pageInfo);
        return ".jsp";
    }

    /**通过商品id查询到商品信息然后返回到商品详情页*/
    @RequestMapping("/queryProduct")
    public String queryProduct(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Product product = productService.queryById(id);
        request.setAttribute("product",product);
        return "product.jsp";
    }

    /**上传并回显之前的照片*/
    String saveFileName = "";
    @ResponseBody
    @RequestMapping("upload")
    public Object ajaxImg(MultipartFile pimage, HttpServletRequest request){
        //提取生成文件名UUID+上传图片的后缀.jpg .png
        saveFileName = FileNameUtil.getUUIDFileName() ;
        System.out.println(saveFileName);
        //得到项目中图片存储的路径
        String path = request.getServletContext().getRealPath("/images/product");
        System.out.println(path);
        //转存
        //ctrl+alt+t

        try {
            pimage.transferTo(new File(path+ File.separator + saveFileName+ FileNameUtil.getFileType(pimage.getOriginalFilename())));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回客户端JSON对象，封装图片的路径，为了在页面实现立即回显
        JSONObject object = new JSONObject();
        object.put("imgurl",saveFileName);

        return object.toString();
    }
    /**更新按钮*/
    @RequestMapping("/updatebutton")
    public String updatebutton(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.queryById(id);
        request.setAttribute("product",product);
        return ".jsp";
    }
    /**更新二级商品信息*/
    @RequestMapping("/update")
    public String update(Product product,HttpServletRequest request){
        int num = productService.update(product);
        if(num > 0){
            request.setAttribute("msg","更新成功！");
        }else{
            request.setAttribute("msg","更新失败");
        }
        return ".jsp";
    }

    /**增加二级类目商品信息*/
    @RequestMapping("/add")
    public String add(Product product,HttpServletRequest request){
        if(saveFileName != "") {
            product.setUrl(saveFileName);
            saveFileName = "";
        }
        int num = productService.add(product);
        if(num > 0){
            request.setAttribute("msg","增加成功！");
        }else{
            request.setAttribute("msg","增加失败");
        }
        return ".jsp";
    }

    /**下架二级商品*/
    @RequestMapping("/lowershelf")
    public String lowershelf(HttpServletRequest request){
       int id = Integer.parseInt(request.getParameter("id"));
       int num = productService.delete(id);
       if(num > 0){
           request.setAttribute("msg","下架成功！");
       }else{
           request.setAttribute("msg","下架失败");
       }
        return ".jsp";
    }

}
