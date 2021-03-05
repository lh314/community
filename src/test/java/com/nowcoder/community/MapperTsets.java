package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
/*启用CommunityApplication为配置类*/
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTsets {

//    注入userMapper
    @Autowired(required=false)
    private UserMapper userMapper;

    @Autowired(required=false)
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
//        User uesr = new User();
        User user = userMapper.selectById(101);
        System.out.println(user);

        user = userMapper.selectByname("liubei");
        System.out.println(user);

        user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("test01");
        user.setPassword("123456");
        user.setSalt("abc");
        user.setEmail("test@qq.com");
        user.setHeaderUrl("http://images.nowcoder.com/head/100t.png");
        user.setCreateTime(new Date());

        int rows = userMapper.insertUser(user);
        System.out.println(rows);
        System.out.println(user.getId());
    }

    @Test
    public void updateUser() {
        int rows = userMapper.updateStatus(153, 1);
        System.out.println(rows);

        rows = userMapper.updateHeader(153, "http://www.nowcoder.com/102.png");
        System.out.println(rows);

        rows = userMapper.updatePassword(0, "hello1");
        System.out.println(rows);

    }

    @Test
    public void testSelectPosts() {

        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for(DiscussPost post : list) {
            System.out.println(post);
        }
//        查询帖子条数
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }

}
