package cn.stroy.Dset404.story.login_sign.service.serviceImp;

import cn.stroy.Dset404.story.login_sign.model.Story_user;

import java.util.List;
import java.util.Map;

/**
 * Created by Destiny_hao on 2017/9/16.
 */
public interface UserServiceImp {

    Map<String, Object> findById(Long id);

    Story_user findByUserName(String username);

    List<Story_user> findAll();

    Map<String, Object> update(Story_user story_user);

    Map<String, Object> delete(Long id);
}
