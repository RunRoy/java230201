package com.atguigu.morningtest;

public class Type {
    public int typeId;
    public String typeName;
    public int typeLevel;

    public Type() {
    }

    public Type(int typeId, String typeName, int typeLevel) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeLevel = typeLevel;
    }

    public String getInfo(){
        return "分类编号："+typeId+",分类名称："+typeName+",分类等级："+typeLevel;
    }
}
