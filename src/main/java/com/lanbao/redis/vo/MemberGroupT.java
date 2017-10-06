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
 * MemberGroupT generated by hbm2java
 */
@Entity
@Table(name = "member_group_t", catalog = "jshoper3")
public class MemberGroupT implements java.io.Serializable {

	private String id;
	private String name;
	private String status;
	private Date createtime;
	private String creatorid;
	private Date updatetime;
	private Integer versiont;
	private String attrs;

	public MemberGroupT() {
	}

	public MemberGroupT(String id, String name, Date createtime,
			String creatorid, Date updatetime) {
		this.id = id;
		this.name = name;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.updatetime = updatetime;
	}

	public MemberGroupT(String id, String name, String status, Date createtime,
			String creatorid, Date updatetime, Integer versiont, String attrs) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.attrs = attrs;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "STATUS", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT")
	public Integer getVersiont() {
		return this.versiont;
	}

	public void setVersiont(Integer versiont) {
		this.versiont = versiont;
	}

	@Column(name = "ATTRS", length = 45)
	public String getAttrs() {
		return this.attrs;
	}

	public void setAttrs(String attrs) {
		this.attrs = attrs;
	}

}
