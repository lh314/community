package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 86186
 */
@Service
/*打破单例
* @Scope("prototype")
* */

public class AlphaService {

 /*注入dao*/

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }
    /*使之构造后调用（初始化需满足构造后调用要求）*/
    @PostConstruct
    /*增加初始化方法*/
    public void init(){
        System.out.println("初始化AlphaService");
    }

    /*销毁之前调用*/

    @PreDestroy
    public void destroy(){
        System.out.println("销毁AlphaService");
    };

    @PreDestroy
    public String find(){
        return alphaDao.select();
    };
}

