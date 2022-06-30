package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.UserDao;
import web.dao.UserDaoImpl;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserDaoImpl userDao;

    @GetMapping("users")
    public String listUser(Model model) {
        model.addAttribute("users", userDao.listUser());

        return "users";
    }

}
