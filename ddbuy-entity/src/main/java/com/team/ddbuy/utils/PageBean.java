package com.team.ddbuy.utils;

import java.io.Serializable;

public class PageBean implements Serializable {
    private Integer page=1;
    private Integer rows=3;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "page=" + page +
                ", rows=" + rows +
                '}';
    }
}
