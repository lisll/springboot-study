package com.datapipeline.model;

import java.util.Date;

public class Book {
    private long id;
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
