package com.example.sample.sas.action;

import org.seasar.struts.annotation.Execute;
import com.example.sample.sas.service.*;
import com.example.sample.sas.entity.*;
import java.util.List;

public class IndexAction
{
  public List users;
  public UserService userService;

    @Execute(validator = false)
    public String index()
    {
      User user = new User();
      user.name = "thata";
      user.age = 17;
      userService.insert(user);

      users = userService.findAll();
        return "index.jsp";
    }
}
