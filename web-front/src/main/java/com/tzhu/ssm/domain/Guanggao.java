package com.tzhu.ssm.domain;

public class Guanggao {
    private Integer ggid;

    private String ggtitle;

    private String ggimg;

    private String ggurl;

    private Integer ggtime;

    public Integer getGgid() {
        return ggid;
    }

    public void setGgid(Integer ggid) {
        this.ggid = ggid;
    }

    public String getGgtitle() {
        return ggtitle;
    }

    public void setGgtitle(String ggtitle) {
        this.ggtitle = ggtitle == null ? null : ggtitle.trim();
    }

    public String getGgimg() {
        return ggimg;
    }

    public void setGgimg(String ggimg) {
        this.ggimg = ggimg == null ? null : ggimg.trim();
    }

    public String getGgurl() {
        return ggurl;
    }

    public void setGgurl(String ggurl) {
        this.ggurl = ggurl == null ? null : ggurl.trim();
    }

    public Integer getGgtime() {
        return ggtime;
    }

    public void setGgtime(Integer ggtime) {
        this.ggtime = ggtime;
    }


    @Override
    public String toString() {
        return "Guanggao{" +
                "ggid=" + ggid +
                ", ggtitle='" + ggtitle + '\'' +
                ", ggimg='" + ggimg + '\'' +
                ", ggurl='" + ggurl + '\'' +
                ", ggtime=" + ggtime +
                '}';
    }
}