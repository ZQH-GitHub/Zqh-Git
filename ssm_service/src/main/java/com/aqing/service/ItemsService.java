package com.aqing.service;

import com.aqing.pojo.Items;

import java.util.List;

/**
 * @author 飓风
 * @date 2020/9/1- 18:39
 */
public interface ItemsService {
    /***
     * 列表查询
     * @return
     */
    List<Items> list();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Items items);
}
