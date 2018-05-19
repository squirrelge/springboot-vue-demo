package com.roypan.platohome.model.common;

public class PageRequestDo {
    private int page;
    private int size;
    private String query;

    public PageRequestDo(){}
    public PageRequestDo(int page, int size, String query) {
        this.page = page;
        this.size = size;
        this.query = query;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
