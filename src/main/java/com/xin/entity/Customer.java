package com.xin.entity;
import java.util.Date;
/**
 * 客户信息数据
 */

/**创建表
 * create database shixi character set utf8 collate utf8_general_ci;
 *   use shixi;
 *   create table customer(
 *     ID varchar(100) primary key,
 *   	name varchar(100)not null,
 *     gender varchar(10)not null,
 *     birthday date not null,
 *     phonenumber int not null,
 *     type varchar(100) varchar,
 *     description varchar(100) varchar
 *   	);
 *   建库
 *
 *  create datebase shixi charaset set utf8mb4 collate utf8_general_ci;
 *   建表
 *   CREATE TABLE customers(
 *   id int(255) unsigned NOT NULL DEFAULT '0' AUTO_INCREMENT COMMENT 'ID',
 *   name varchar(10) NOT NULL DEFAULT ''  COMMENT '姓名',
 *   gender varchar(6) NOT NULL DEFAULT ''  COMMENT '性别',
 *   birthday datetime NOT NULL DEFAULT '1900-01-01 00:00:00'COMMENT '生日',
 *   phone_number varchar(20) NOT NULL DEFAULT '' COMMENT '电话号码',
 *   email varchar(50) NOT NULL DEFAULT '' COMMENT '邮箱',
 *   description varchar(100) NOT NULL DEFAULT ''  COMMENT '其他',
 *   PRIMARY KEY ('id')
 * ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='客户表';
 *
 *  修改表
 *  ALTER TABLE customer ADD Images VARCHAR(20) NOT NULL DEFAULT '' COMMENT '图片';
 *  ALTER TABLE user MODIFY Images VARCHAR(200) NOT NULL DEFAULT '' COMMENT '证件照';
 *  ALTER TABLE user DROP Images;
 *  ALTER TABLE user CHANGE name username varchar(100);
 *
 */
public class Customer {
    private int id;
    private String name;
    private String gender;
    private Date birthday;
    private String phonenumber;
    private String email;
    private String description;

    public Customer() {
    }

    public Customer(int id, String name, String gender, Date birthday, String phonenumber, String email, String description) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
        this.email = email;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer(String name, String gender, Date birthday, String phonenumber, String email, String description) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
        this.email = email;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
