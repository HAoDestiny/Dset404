package cn.stroy.Dset404.story.login_sign.service;

import cn.stroy.Dset404.story.login_sign.dao.Story_userMapper;
import cn.stroy.Dset404.story.login_sign.model.Story_user;
import cn.stroy.Dset404.story.login_sign.service.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Destiny_hao on 2017/9/16.
 */

@Service("UserService")
public class UserService implements UserServiceImp {

    final
    Story_userMapper story_userMapper;

    @Autowired(required = false)
    public UserService(Story_userMapper story_userMapper) {
        this.story_userMapper = story_userMapper;
    }

    @Override
    public Map<String, Object> findById(Long id) {
        Map<String, Object> map = new HashMap<>();
        Object object = story_userMapper.selectByPrimaryKey(id);
        if (null != object) {
            map.put("status", true);
            map.put("message", "查询成功");
            map.put("value", object);
            return map;
        }
        map.put("status", false);
        map.put("message", "查询失败，查询的id不存在");
        map.put("value", object);
        return map;
    }

    @Override
    public Story_user findByUserName(String username) {
        return story_userMapper.selectByUserName(username);
    }

    @Override
    public List<Story_user> findAll() {
        return story_userMapper.selectAll();
    }

    @Override
    public Map<String, Object> update(Story_user story_user) {
        Map<String, Object> map = new HashMap<>();
        if(story_userMapper.updateByPrimaryKeySelective(story_user) == 1) {
            map.put("message", "更新成功");
            return map;
        }
        map.put("message", "更新失败");
        return map;
    }

    @Override
    public Map<String, Object> delete(Long id) {
        Map<String, Object> map = new HashMap<>();
        if(story_userMapper.deleteByPrimaryKey(id) == 1) {
            map.put("message", "删除成功");
            return map;
        }
        map.put("message", "删除失败");
        return map;
    }


}
