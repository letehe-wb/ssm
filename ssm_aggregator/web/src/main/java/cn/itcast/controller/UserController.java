package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 王波
 * @version V1.0
 * @date 2019/6/14 21:49
 * @discription:
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有数据
     * @return
     */
    @RequestMapping("list")
    public String list(Model model){
        System.out.println("qwe");
        List<User> users = userService.findAllUser();
        model.addAttribute("users",users);
        return "users";
    }

    @RequestMapping("toSave")
    public String toSave(){
        return "userAdd";
    }

    @RequestMapping("save")
    public String save(User user){
        userService.saveUser(user);
        return "redirect:/user/list";
    }


}
