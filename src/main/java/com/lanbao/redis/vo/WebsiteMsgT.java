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
 * WebsiteMsgT generated by hbm2java
 */
@Entity
@Table(name = "website_msg_t", catalog = "jshoper3")
public class WebsiteMsgT implements java.io.Serializable {

	private String msgid;
	private String msgtousername;
	private String msgfromuserid;
	private String msgfromusrname;
	private String msgtextid;
	private String state;
	private String title;
	private Date createtime;
	private String msgstate;
	private Date readtime;

	public WebsiteMsgT() {
	}

	public WebsiteMsgT(String msgid, String msgtousername,
			String msgfromuserid, String msgfromusrname, String msgtextid,
			String state, String title, Date createtime, String msgstate,
			Date readtime) {
		this.msgid = msgid;
		this.msgtousername = msgtousername;
		this.msgfromuserid = msgfromuserid;
		this.msgfromusrname = msgfromusrname;
		this.msgtextid = msgtextid;
		this.state = state;
		this.title = title;
		this.createtime = createtime;
		this.msgstate = msgstate;
		this.readtime = readtime;
	}

	@Id
	@Column(name = "MSGID", unique = true, nullable = false, length = 20)
	public String getMsgid() {
		return this.msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	@Column(name = "MSGTOUSERNAME", nullable = false, length = 50)
	public String getMsgtousername() {
		return this.msgtousername;
	}

	public void setMsgtousername(String msgtousername) {
		this.msgtousername = msgtousername;
	}

	@Column(name = "MSGFROMUSERID", nullable = false, length = 20)
	public String getMsgfromuserid() {
		return this.msgfromuserid;
	}

	public void setMsgfromuserid(String msgfromuserid) {
		this.msgfromuserid = msgfromuserid;
	}

	@Column(name = "MSGFROMUSRNAME", nullable = false, length = 50)
	public String getMsgfromusrname() {
		return this.msgfromusrname;
	}

	public void setMsgfromusrname(String msgfromusrname) {
		this.msgfromusrname = msgfromusrname;
	}

	@Column(name = "MSGTEXTID", nullable = false, length = 20)
	public String getMsgtextid() {
		return this.msgtextid;
	}

	public void setMsgtextid(String msgtextid) {
		this.msgtextid = msgtextid;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "TITLE", nullable = false, length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "MSGSTATE", nullable = false, length = 1)
	public String getMsgstate() {
		return this.msgstate;
	}

	public void setMsgstate(String msgstate) {
		this.msgstate = msgstate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "READTIME", nullable = false, length = 0)
	public Date getReadtime() {
		return this.readtime;
	}

	public void setReadtime(Date readtime) {
		this.readtime = readtime;
	}

}
