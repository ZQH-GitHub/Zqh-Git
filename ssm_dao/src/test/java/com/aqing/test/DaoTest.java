package com.aqing.test;

import com.aqing.dao.ItemDao;
import com.aqing.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author 飓风
 * @date 2020/9/1- 9:44
 */
public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemDao itemsDao = (ItemDao) applicationContext.getBean("itemDao");
        Items items = new Items();
        items.setName("淡水");//商品名称
        items.setCreatetime(new Date());//时间
        items.setPrice(1888f);//价格
        items.setPic("1.jpg");
        items.setDetail("高级服务");
        itemsDao.save(items);

        List<Items> list = itemsDao.list();
        for (Items im : list) {
            System.out.println(im);
        }
    }
}
