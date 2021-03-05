package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/*访问数据库的bean需要加*/
@Repository("alphaHibernate")
public class AlphaDaoHibernatelmpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
