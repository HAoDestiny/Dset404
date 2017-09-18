package cn.stroy.Dset404.story.login_sign.service.serviceImp;

import cn.stroy.Dset404.story.login_sign.model.Story_user;

import java.util.List;

/**
 * Created by Destiny_hao on 2017/9/16.
 */
public interface UserServiceImp {

    Story_user findById(Long id);

    Story_user findByUserName(String username);

    List<Story_user> findAll();
}
