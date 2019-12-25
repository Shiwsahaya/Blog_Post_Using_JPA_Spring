package net.blog.post.controller;

import net.blog.post.model.Posts;
import net.blog.post.model.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class PostsController {

    @Autowired
    public PostsService service;

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("result");
        List<Posts> listCustomer = service.listAll();
        mav.addObject("listCustomer", listCustomer);
        System.out.println(listCustomer.get(0).getTitle());
        return mav;
    }

    @RequestMapping("/new")
    public String newPost(Map<String,Object>model){
        model.put("posts",new Posts());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePost(@ModelAttribute("posts") Posts posts){
        service.save(posts);
        return "redirect:/";
    }

    @RequestMapping("edit")
    public ModelAndView editPosts(@RequestParam int id){
        ModelAndView modelAndView=new ModelAndView("editPost");
        Posts posts=service.get(id);
        modelAndView.addObject("posts",posts);
        return modelAndView;
    }
    @RequestMapping("/delete")
    public String deletePost(@RequestParam int id){
        service.delete(id);
        return "redirect:/";
    }

}
