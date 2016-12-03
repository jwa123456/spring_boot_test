package controller;

import entity.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

/**
 * Created by jw on 16-12-3.
 */
@Controller
class UserController {


    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.findUserInfo();
        if (user != null) {
            System.out.println(user.getId() + user.getName());
            logger.info("user:" + user.getName());
        }
        return user;
    }

}
