package cn.edu.ecut.service.impl;

import cn.edu.ecut.entity.User;
import cn.edu.ecut.mapper.UserMapper;
import cn.edu.ecut.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ecut
 * @since 2021-07-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
