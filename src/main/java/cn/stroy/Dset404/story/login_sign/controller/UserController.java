package cn.stroy.Dset404.story.login_sign.controller;

import cn.stroy.Dset404.story.login_sign.model.Story_user;
import cn.stroy.Dset404.story.login_sign.service.UserService;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Destiny_hao on 2017/9/16.
 */

@Controller
@RequestMapping("user")
public class UserController {

    @Resource(name = "UserService")
    UserService userService;

    @RequestMapping(value = "/findOne/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> findOne(@PathVariable String id) {
        System.out.println("findOne- - -  - - -" + id);
        return userService.findById(Long.valueOf(id));
    }

    @RequestMapping(value = "/findByName/{username}", method = RequestMethod.GET)
    public @ResponseBody Story_user findByName(@PathVariable String username) {
        System.out.println("findByName- - -  - - -" + username);
        return userService.findByUserName(username);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public @ResponseBody List<Story_user> findAll() {
        System.out.println("findAll- - -  - - -" );
        return userService.findAll();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> update(@RequestBody Story_user story_user) {
        System.out.println("update- - -  - - -" );
        return userService.update(story_user);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> delete(@PathVariable String id) {
        System.out.println("delete- - -  - - -" );
        return userService.delete(Long.valueOf(id));
    }
}
