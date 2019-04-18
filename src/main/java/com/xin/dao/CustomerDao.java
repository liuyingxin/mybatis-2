package com.xin.dao;



import com.xin.entity.Customer;

import java.io.IOException;
import java.util.List;

/**
 * 增删改查方法接口
 * @author ly
 */
public interface CustomerDao {
    /**
     * 查询所有用户信息
     * @return 用户信息数据集合
     */
    List<Customer> findAll() ;

    /**
     * 保存用户
     * @param c 用户信息
     */
    void save(Customer c);


    /**
     * 按照id查询用户
     * @param customerId 用户id
     * @return 返回用户信息
     */
    Customer findById(Integer customerId);


    /**
     * 修改用户信息
     * @param c 用户信息
     */
    void update(Customer c);


    /**
     *按照用户id删除用户
     * @param customerId 用户id
     */
    void delete(Integer customerId);

}
