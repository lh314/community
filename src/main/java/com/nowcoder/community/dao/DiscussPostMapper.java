package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

//  offest 每一行行号

    List<DiscussPost> selectDiscussPosts(int userId,int offest, int limit);

//    @Param注解用于给参数起别名，
//    如果只有一个参数，并且在《if》里使用，则必须加别名

    int selectDiscussPostRows(@Param("userId") int userId);


}
