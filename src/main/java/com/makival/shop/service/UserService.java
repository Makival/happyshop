package com.makival.shop.service;

import com.makival.shop.domain.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kiryl Karatkevich
 * @since February 22, 2019
 */
@Service
public interface UserService {

    List<User> getUsers();

    User getUserById();

}
