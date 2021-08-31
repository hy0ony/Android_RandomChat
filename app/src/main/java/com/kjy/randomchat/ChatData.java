package com.kjy.randomchat;

import java.util.Date;

public class ChatData {

    private int mem_idx;
    private String name;
    private String src;
    private int chet_idx;
    private int m_idx;
    private String msg;
    private Date timestamp;

    public int getMem_idx() {
        return mem_idx;
    }

    public void setMem_idx(int mem_idx) {
        this.mem_idx = mem_idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getChet_idx() {
        return chet_idx;
    }

    public void setChet_idx(int chet_idx) {
        this.chet_idx = chet_idx;
    }

    public int getM_idx() {
        return m_idx;
    }

    public void setM_idx(int m_idx) {
        this.m_idx = m_idx;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
