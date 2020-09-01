package com.aqing.dao;

import com.aqing.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 飓风
 * @date 2020/9/1- 18:23
 */
//@Repository("itemDao")//可不写:接口默认bean是itemDao
public interface ItemDao {
    /***
     * 查询所有
     * @return
     */
    List<Items> list();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
