package com.datapipeline.model;

import java.sql.Date;


// 这个类名一定要和数据库中的表名一致，否则会有问题
public class A_flink_test {
//    CREATE TABLE `a_flink_test` (
//            `id` bigint(20) NOT NULL AUTO_INCREMENT,
//  `col_num` bigint(255) DEFAULT NULL,
//  `col_var` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//  `col_bool` tinyint(1) DEFAULT NULL,
//  `col_date` date DEFAULT NULL,
//            `col_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//  `comm` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT '此列为备注信息',
//    PRIMARY KEY (`id`)
//) ENGINE=InnoDB AUTO_INCREMENT=89717402 DEFAULT CHARSET=utf8
    private long id ;
    private long col_num;
    private String col_var;
    private int col_bool;
    private Date col_date;
    private String comm;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", col_num=" + col_num +
                ", col_var='" + col_var + '\'' +
                ", col_bool=" + col_bool +
                ", col_date=" + col_date +
                ", comm='" + comm + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCol_num() {
        return col_num;
    }

    public void setCol_num(long col_num) {
        this.col_num = col_num;
    }

    public String getCol_var() {
        return col_var;
    }

    public void setCol_var(String col_var) {
        this.col_var = col_var;
    }

    public int getCol_bool() {
        return col_bool;
    }

    public void setCol_bool(int col_bool) {
        this.col_bool = col_bool;
    }

    public Date getCol_date() {
        return col_date;
    }

    public void setCol_date(Date col_date) {
        this.col_date = col_date;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
}
