package com.xt.controller;

import com.xt.utils.JsonResult;
import com.xt.vo.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("blog")
public class BlogController {
    public  List<Blog> b = new ArrayList<Blog>();
    {
        Blog blog1 = new Blog(1,"今天晴天");
        Blog blog2 = new Blog(2,"禁止copy");
        Blog blog3 = new Blog(3,"后天也下雨");
        b.add(blog1);
        b.add(blog2);
        b.add(blog3);
    }

    @RequestMapping("/getBlog/{id}")
    @ResponseBody
    public JsonResult<Blog> getBlogByid(@PathVariable(value = "id",required = true)int ad ){
        Blog blog = null;
        for (int i = 0; i <b.size() ; i++) {
            if(b.get(i).getId()==ad){
                blog= b.get(i);
            }
        }
        return new JsonResult<Blog>("ok",blog,"0");
    }
}
