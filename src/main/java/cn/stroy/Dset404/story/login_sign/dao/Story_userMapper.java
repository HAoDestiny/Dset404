package cn.stroy.Dset404.story.login_sign.dao;

import cn.stroy.Dset404.story.login_sign.model.Story_user;

import java.util.List;

public interface Story_userMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Story_user record);

    int insertSelective(Story_user record);

    Story_user selectByPrimaryKey(Long id);

    Story_user selectByUserName(String username);

    List<Story_user> selectAll();

    int updateByPrimaryKeySelective(Story_user record);

    int updateByPrimaryKey(Story_user record);
}