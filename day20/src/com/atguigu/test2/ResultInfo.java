package com.atguigu.test2;

import java.io.Serializable;

public class ResultInfo implements Serializable {
    private String info;
    private boolean flag;

    public ResultInfo() {
    }

    public ResultInfo(String info, boolean flag) {
        this.info = info;
        this.flag = flag;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "info='" + info + '\'' +
                ", flag=" + flag +
                '}';
    }
}
