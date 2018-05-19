package com.roypan.platohome.model.common;

import java.util.List;

public class PageResponseDo {
    private int total;
    private List<?> rows;
    private boolean success;
    private String message;
    public PageResponseDo() {
    }

    public PageResponseDo(boolean success,String message,int total, List<?> rows) {
        this.success = success;
        this.message = message;
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
