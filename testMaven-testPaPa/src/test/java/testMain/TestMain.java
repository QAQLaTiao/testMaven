package testMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guoy.dao.MyBatisDao;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMain {


    @Resource
    MyBatisDao myBatisDao;


    public static void main(String[] args) {

    String nana = "曹亚洁";
        System.out.println(nana);



    }


    @Test
    public void queryUserAll() {
        List<User> selectList = myBatisDao.selectList("UserMapper.queryUserAll");
        //
        System.out.println(selectList);

    }
}