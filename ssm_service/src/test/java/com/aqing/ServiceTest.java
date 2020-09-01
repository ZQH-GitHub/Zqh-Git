package com.aqing;

import com.aqing.pojo.Items;
import com.aqing.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author 飓风
 * @date 2020/9/1- 10:09
 */
public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        /*<bean id = "itemsDao" class="com.itheima.xxxxxItemsDao> "*/
        ItemsService itemsService = (ItemsService)ac.getBean("itemsServiceImpl");

        Items items = new Items();
        items.setName("淡水666");//商品名称
        items.setCreatetime(new Date());//时间
        items.setPrice(1888f);//价格
        items.setPic("1.jpg");
        items.setDetail("高级技师服务");
        itemsService.save(items);

        List<Items> list = itemsService.list();
        for (Items im : list) {
            System.out.println(im);
        }
    }
}
