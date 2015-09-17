package com.xjk.project.model;

/**
 *
 *
 * @author: jinkai.xu
 *
 * @Date: 15/9/17
 */
public class WxMenuModel {

    private int id;

    private int pid;

    private int positionid;

    private String title;

    private int type;

    private String content;

    private int uid;

    private int del;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPositionid() {
        return positionid;
    }

    public void setPositionid(int positionid) {
        this.positionid = positionid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "WxMenuModel{" +
                "id=" + id +
                ", pid=" + pid +
                ", positionid=" + positionid +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", uid=" + uid +
                ", del=" + del +
                '}';
    }
}
