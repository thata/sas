package com.example.sample.sas.service;

import com.example.sample.sas.entity.User
import org.seasar.extension.jdbc.service.S2AbstractService;

public class UserService extends S2AbstractService<User> {
    // private List<User> selectByUserGroup(int user_grp_no) {
    //     return select().where("(user_grp & ?) = ? AND enb = 1 AND del = 0", user_grp_no, user_grp_no).getResultList();
    // }
}

