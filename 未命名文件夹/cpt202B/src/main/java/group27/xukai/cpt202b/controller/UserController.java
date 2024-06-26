package group27.xukai.cpt202b.controller;


//import group27.xukai.cpt202b.Intercepter.LoginInterceptor;
import group27.xukai.cpt202b.service.serviceImpl.UserService;
import group27.xukai.cpt202b.entity.User;
import group27.xukai.cpt202b.mapper.userMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    private userMapper userMapper;

//    @PostMapping("/login")
//    public User login(@RequestBody User user) {
//        User dbUser = userMapper.getUserByNameAndPassword(user.getUsername(), user.getPassword());
//
//        if (dbUser != null) {
//            LoginInterceptor.success(true);
//        }
//        return dbUser;
//    }
    @PostMapping("/emailexist")
    public Map<String, Object> emailexist(@RequestBody User user) {
        Map<String, Object> response = new HashMap<>();
        User emailUser = userMapper.getUserByEmail(user.getEmail());
        if (emailUser != null) {
            response.put("id", emailUser.getId());
            response.put("email", emailUser.getEmail());
        } else {
            response.put("id", null); // 或者返回空字符串
        }
        return response;
    }
    @Autowired
    private UserService userService;
    @PostMapping("/oldpassword")
    public String oldpassword(@RequestBody String email) {
        String oldpassword = userMapper.getPasswordByEmail(email);
        return oldpassword;
    }
    @PostMapping("/resetpassword")
    public void resetpassword(@RequestBody User user) {
        String email = user.getEmail();
        String newpassword = user.getPassword();
        userMapper.updatePasswordByEmail(email,newpassword);
    }

}


