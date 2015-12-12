package shcherbakov.sergey.springMvcExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import shcherbakov.sergey.springMvcExample.model.User;
 
@Controller
public class SpringMvcController {
    
    @RequestMapping(value = "/springMvc")
    public String formAndUsers(ModelMap model) {
        return "formAndUsers";
    }
    
    @RequestMapping(value = "/springMvc/addUser", method = RequestMethod.POST)
    public String addNewUser(@RequestParam("login") String login, @RequestParam("sex") String sex, ModelMap model){
        User newUser = new User(login, sex);
        model.addAttribute("login", login);
        model.addAttribute("sex", sex);
        
        return "newUser";
    }
}
