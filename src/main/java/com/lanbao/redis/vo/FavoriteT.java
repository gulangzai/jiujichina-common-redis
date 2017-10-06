package com.lanbao.redis.vo;

// Generated 2014-10-9 18:51:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FavoriteT generated by hbm2java
 */
@Entity
@Table(name = "favorite_t", catalog = "jshoper3")
public class FavoriteT implements java.io.Serializable {

	private String favoriteid;
	private String title;
	private String goodsid;
	private String tag;
	private String descript;
	private String memberid;
	private String state;
	private Date addtime;
	private Integer readcount;
	private String memberprice;
	private String productid;
	private String htmlpath;

	public FavoriteT() {
	}

	public FavoriteT(String favoriteid, String title, String memberid,
			String state, Date addtime, String htmlpath) {
		this.favoriteid = favoriteid;
		this.title = title;
		this.memberid = memberid;
		this.state = state;
		this.addtime = addtime;
		this.htmlpath = htmlpath;
	}

	public FavoriteT(String favoriteid, String title, String goodsid,
			String tag, String descript, String memberid, String state,
			Date addtime, Integer readcount, String memberprice,
			String productid, String htmlpath) {
		this.favoriteid = favoriteid;
		this.title = title;
		this.goodsid = goodsid;
		this.tag = tag;
		this.descript = descript;
		this.memberid = memberid;
		this.state = state;
		this.addtime = addtime;
		this.readcount = readcount;
		this.memberprice = memberprice;
		this.productid = productid;
		this.htmlpath = htmlpath;
	}

	@Id
	@Column(name = "FAVORITEID", unique = true, nullable = false, length = 20)
	public String getFavoriteid() {
		return this.favoriteid;
	}

	public void setFavoriteid(String favoriteid) {
		this.favoriteid = favoriteid;
	}

	@Column(name = "TITLE", nullable = false, length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "GOODSID", length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "TAG", length = 20)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "DESCRIPT", length = 50)
	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	@Column(name = "MEMBERID", nullable = false, length = 20)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ADDTIME", nullable = false, length = 0)
	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	@Column(name = "READCOUNT")
	public Integer getReadcount() {
		return this.readcount;
	}

	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}

	@Column(name = "MEMBERPRICE", length = 10)
	public String getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(String memberprice) {
		this.memberprice = memberprice;
	}

	@Column(name = "PRODUCTID", length = 20)
	public String getProductid() {
		return this.productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	@Column(name = "HTMLPATH", nullable = false)
	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

}
