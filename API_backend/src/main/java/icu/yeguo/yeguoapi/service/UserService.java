package icu.yeguo.yeguoapi.service;

import icu.yeguo.yeguoapi.model.dto.user.UserQueryRequest;
import icu.yeguo.yeguoapi.model.dto.user.UserUpdateRequest;
import icu.yeguo.yeguoapi.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import icu.yeguo.yeguoapi.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;

/**
 * @author yeguo
 *  针对表【user(用户表)】的数据库操作Service
 *  2024-05-08 18:58:22
 */
public interface UserService extends IService<User> {
    long userRegister(String username, String userAccount, String userPassword, String checkPassword);

    UserVO userLogin(String userAccount, String userPassword, HttpServletRequest req);

    UserVO getUserVO(User user);

    User selectById(Long id);

    ArrayList<UserVO> selectAll();

    int rmByid(Long id);

    int upById(UserUpdateRequest userUpdateRequest);

    UserVO getCurrentUser(HttpServletRequest req);

    ArrayList<UserVO> dynamicQuery(UserQueryRequest userQueryRequest);

    long userEmailRegister(String email, String verifyCode, HttpServletRequest req);

    UserVO userEmailLogin(String email, String verifyCode, HttpServletRequest req);
}