package cn.stroy.Dset404.story.login_sign.service;

import cn.stroy.Dset404.story.login_sign.dao.Story_userMapper;
import cn.stroy.Dset404.story.login_sign.model.Story_user;
import cn.stroy.Dset404.story.login_sign.service.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Destiny_hao on 2017/9/16.
 */

@Service("UserService")
public class UserService implements UserServiceImp{

    final
    Story_userMapper story_userMapper;

    @Autowired(required = false)
    public UserService(Story_userMapper story_userMapper) {
        this.story_userMapper = story_userMapper;
    }

    @Override
    public Story_user findById(Long id) {
        return story_userMapper.selectByPrimaryKey(id);
    }

    @Override
    public Story_user findByUserName(String username) {
        return story_userMapper.selectByUserName(username);
    }

    @Override
    public List<Story_user> findAll() {
        return story_userMapper.selectAll();
    }
}
