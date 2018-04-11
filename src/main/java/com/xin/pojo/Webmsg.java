package com.xin.pojo;

public class Webmsg {
    private Integer id;

    private String webgg;

    private String wx;

    private String qq;

    private String footer;

    private String footer2;

    private String remake;

    private String top;

    private String jhmhref;

    private String vip;

    private String viphref;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebgg() {
        return webgg;
    }

    public void setWebgg(String webgg) {
        this.webgg = webgg;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getFooter2() {
        return footer2;
    }

    public void setFooter2(String footer2) {
        this.footer2 = footer2;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getJhmhref() {
        return jhmhref;
    }

    public void setJhmhref(String jhmhref) {
        this.jhmhref = jhmhref;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getViphref() {
        return viphref;
    }

    public void setViphref(String viphref) {
        this.viphref = viphref;
    }

	@Override
	public String toString() {
		return "Webmsg [id=" + id + ", webgg=" + webgg + ", wx=" + wx + ", qq=" + qq + ", footer=" + footer
				+ ", footer2=" + footer2 + ", remake=" + remake + ", top=" + top + ", jhmhref=" + jhmhref + ", vip="
				+ vip + ", viphref=" + viphref + "]";
	}
}