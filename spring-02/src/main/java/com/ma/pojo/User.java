package com.ma.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class User {
    private String name;
    private Map<String, String> maps;
    private List<String> books;
    private Set<String> info;
    private Address address;
    private String [] works;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Set<String> getInfo() {
        return info;
    }

    public void setInfo(Set<String> info) {
        this.info = info;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getWorks() {
        return works;
    }

    public void setWorks(String[] works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", maps=" + maps +
                ", books=" + books +
                ", info=" + info +
                ", address=" + address +
                ", works=" + Arrays.toString(works) +
                '}';
    }
}
