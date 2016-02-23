package ru.ogify.srs.stash.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by melge on 20.02.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class PageLoadResult<T> {
    private int size;
    private int limit;
    private boolean isLastPage;
    private int start;
    private int nextPageStart;
    private List<T> values;

    public PageLoadResult() {
        values = new ArrayList<>();
    }

    public PageLoadResult(List<T> values) {
        this.values = values;
        size = values.size();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public void setIsLastPage(boolean isLastPage) {
        this.isLastPage = isLastPage;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getNextPageStart() {
        return nextPageStart;
    }

    public void setNextPageStart(int nextPageStart) {
        this.nextPageStart = nextPageStart;
    }

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
    }
}
