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
 * WeixinDepartmentMemberCpT generated by hbm2java
 */
@Entity
@Table(name = "weixin_department_member_cp_t", catalog = "jshoper3")
public class WeixinDepartmentMemberCpT implements java.io.Serializable {

	private String id;
	private String userid;
	private String name;
	private String department;
	private String position;
	private Date createtime;
	private Date updatetime;
	private String creatorid;
	private String statue;
	private String mobile;
	private String gender;
	private String tel;
	private String email;
	private String weixinid;
	private String jshopid;
	private String jshopname;
	private int versiont;
	private String enable;
	private String avatar;

	public WeixinDepartmentMemberCpT() {
	}

	public WeixinDepartmentMemberCpT(String id, String userid, String name,
			Date createtime, Date updatetime, String creatorid, int versiont) {
		this.id = id;
		this.userid = userid;
		this.name = name;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.creatorid = creatorid;
		this.versiont = versiont;
	}

	public WeixinDepartmentMemberCpT(String id, String userid, String name,
			String department, String position, Date createtime,
			Date updatetime, String creatorid, String statue, String mobile,
			String gender, String tel, String email, String weixinid,
			String jshopid, String jshopname, int versiont, String enable,
			String avatar) {
		this.id = id;
		this.userid = userid;
		this.name = name;
		this.department = department;
		this.position = position;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.creatorid = creatorid;
		this.statue = statue;
		this.mobile = mobile;
		this.gender = gender;
		this.tel = tel;
		this.email = email;
		this.weixinid = weixinid;
		this.jshopid = jshopid;
		this.jshopname = jshopname;
		this.versiont = versiont;
		this.enable = enable;
		this.avatar = avatar;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "USERID", nullable = false, length = 64)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "NAME", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DEPARTMENT", length = 1000)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "POSITION", length = 64)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "STATUE", length = 1)
	public String getStatue() {
		return this.statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

	@Column(name = "MOBILE", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "GENDER", length = 1)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "TEL", length = 64)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "EMAIL", length = 64)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "WEIXINID", length = 100)
	public String getWeixinid() {
		return this.weixinid;
	}

	public void setWeixinid(String weixinid) {
		this.weixinid = weixinid;
	}

	@Column(name = "JSHOPID", length = 20)
	public String getJshopid() {
		return this.jshopid;
	}

	public void setJshopid(String jshopid) {
		this.jshopid = jshopid;
	}

	@Column(name = "JSHOPNAME", length = 45)
	public String getJshopname() {
		return this.jshopname;
	}

	public void setJshopname(String jshopname) {
		this.jshopname = jshopname;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Column(name = "ENABLE", length = 1)
	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	@Column(name = "AVATAR")
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}