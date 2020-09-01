package com.aqing.service.impl;


import com.aqing.dao.ItemDao;
import com.aqing.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 飓风
 * @date 2020/9/1- 18:39
 */
@Service
public class ItemsServiceImpl implements com.aqing.service.ItemsService {
    @Autowired
    private ItemDao itemDao;

    /***
     * 集合查询
     * @return
     */
    public List<Items> list() {
        return itemDao.list();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
    public int save(Items items) {
        int acount = itemDao.save(items);
        System.out.println("acount:"+acount);
        return acount;
    }
}
