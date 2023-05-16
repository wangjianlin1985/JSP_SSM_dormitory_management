// 
// 
// 

package com.itheima.po;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class PageInfo<T> implements Serializable
{
    private Integer pageIndex;
    private Integer pageSize;
    private Integer totalCount;
    private Integer pageTotalCount;
    private List<T> list;
    
    public PageInfo() {
        this.pageIndex = 1;
        this.pageSize = 3;
        this.totalCount = 0;
        this.pageTotalCount = 0;
        this.list = new ArrayList<T>();
    }
    
    public Integer getPageIndex() {
        return this.pageIndex;
    }
    
    public void setPageIndex(final Integer pageIndex) {
        this.pageIndex = pageIndex;
        if (pageIndex == null || pageIndex < 1) {
            this.pageIndex = 1;
        }
    }
    
    public Integer getPageSize() {
        return this.pageSize;
    }
    
    public void setPageSize(final Integer pageSize) {
        this.pageSize = pageSize;
        if (pageSize == null || pageSize < 1) {
            this.pageSize = 3;
        }
    }
    
    public Integer getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(final Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public Integer getPageTotalCount() {
        this.pageTotalCount = this.totalCount / this.pageSize;
        if (this.totalCount % this.pageSize != 0) {
            ++this.pageTotalCount;
        }
        return this.pageTotalCount;
    }
    
    public void setPageTotalCount(final Integer pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }
    
    public List<T> getList() {
        return this.list;
    }
    
    public void setList(final List<T> list) {
        this.list = list;
    }
}
