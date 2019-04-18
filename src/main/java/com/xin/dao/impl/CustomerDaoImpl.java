package com.xin.dao.impl;

import com.xin.entity.Customer;
import com.xin.dao.CustomerDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 增删改查方法实现
 *
 * @author ly
 */
public class CustomerDaoImpl implements CustomerDao {

        String resource = "mybatis-config.xml";
        InputStream inputStream;
    {
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    @Override
    public List<Customer> findAll() {
        SqlSession session = sqlSessionFactory.openSession();
        List<Customer> customers = session.selectList("selectAll");
        return customers;
    }

    @Override
    public void insert(Customer c) {
        SqlSession session = sqlSessionFactory.openSession();
        session.update("insertCustomer", c);
        session.commit();
        session.close();
    }

    @Override
    public Customer findById(Integer customerId) {
        SqlSession session = sqlSessionFactory.openSession();
        Customer customer = session.selectOne("selectById", customerId);
        session.close();
        return customer;
    }

    @Override
    public void update(Customer c) {
        SqlSession session = sqlSessionFactory.openSession();
        session.update("updateCustomers", c);
        session.commit();
        session.close();
    }

    @Override
    public void delete(Integer customerId) {
        SqlSession session = sqlSessionFactory.openSession();
        session.delete("deleteById", customerId);
        session.commit();
        session.close();
    }
}