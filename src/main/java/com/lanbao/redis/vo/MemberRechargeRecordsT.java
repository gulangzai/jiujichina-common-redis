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
 * MemberRechargeRecordsT generated by hbm2java
 */
@Entity
@Table(name = "member_recharge_records_t", catalog = "jshoper3")
public class MemberRechargeRecordsT implements java.io.Serializable {

	private String id;
	private String memberid;
	private String membername;
	private double money;
	private Date createtime;
	private String type;
	private String shopid;

	public MemberRechargeRecordsT() {
	}

	public MemberRechargeRecordsT(String id, String memberid,
			String membername, double money, Date createtime, String type) {
		this.id = id;
		this.memberid = memberid;
		this.membername = membername;
		this.money = money;
		this.createtime = createtime;
		this.type = type;
	}

	public MemberRechargeRecordsT(String id, String memberid,
			String membername, double money, Date createtime, String type,
			String shopid) {
		this.id = id;
		this.memberid = memberid;
		this.membername = membername;
		this.money = money;
		this.createtime = createtime;
		this.type = type;
		this.shopid = shopid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "MEMBERID", nullable = false, length = 20)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "MEMBERNAME", nullable = false, length = 100)
	public String getMembername() {
		return this.membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	@Column(name = "MONEY", nullable = false, precision = 10)
	public double getMoney() {
		return this.money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "TYPE", nullable = false, length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "SHOPID", length = 20)
	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}
