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
 * OrderInvoiceT generated by hbm2java
 */
@Entity
@Table(name = "order_invoice_t", catalog = "jshoper3")
public class OrderInvoiceT implements java.io.Serializable {

	private String orderInvoiceid;
	private String orderid;
	private String invType;
	private String invPayee;
	private String amount;
	private String memberid;
	private String state;
	private String membername;
	private String invContent;
	private Date createtime;
	private Date updatetime;
	private int versiont;
	private String shopid;

	public OrderInvoiceT() {
	}

	public OrderInvoiceT(String orderInvoiceid, String orderid, String invType,
			String invPayee, String amount, String memberid, String state,
			String membername, Date createtime, Date updatetime, int versiont) {
		this.orderInvoiceid = orderInvoiceid;
		this.orderid = orderid;
		this.invType = invType;
		this.invPayee = invPayee;
		this.amount = amount;
		this.memberid = memberid;
		this.state = state;
		this.membername = membername;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	public OrderInvoiceT(String orderInvoiceid, String orderid, String invType,
			String invPayee, String amount, String memberid, String state,
			String membername, String invContent, Date createtime,
			Date updatetime, int versiont, String shopid) {
		this.orderInvoiceid = orderInvoiceid;
		this.orderid = orderid;
		this.invType = invType;
		this.invPayee = invPayee;
		this.amount = amount;
		this.memberid = memberid;
		this.state = state;
		this.membername = membername;
		this.invContent = invContent;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.shopid = shopid;
	}

	@Id
	@Column(name = "ORDER_INVOICEID", unique = true, nullable = false, length = 20)
	public String getOrderInvoiceid() {
		return this.orderInvoiceid;
	}

	public void setOrderInvoiceid(String orderInvoiceid) {
		this.orderInvoiceid = orderInvoiceid;
	}

	@Column(name = "ORDERID", nullable = false, length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "INV_TYPE", nullable = false, length = 10)
	public String getInvType() {
		return this.invType;
	}

	public void setInvType(String invType) {
		this.invType = invType;
	}

	@Column(name = "INV_PAYEE", nullable = false, length = 45)
	public String getInvPayee() {
		return this.invPayee;
	}

	public void setInvPayee(String invPayee) {
		this.invPayee = invPayee;
	}

	@Column(name = "AMOUNT", nullable = false, length = 20)
	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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

	@Column(name = "MEMBERNAME", nullable = false, length = 50)
	public String getMembername() {
		return this.membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	@Column(name = "INV_CONTENT", length = 45)
	public String getInvContent() {
		return this.invContent;
	}

	public void setInvContent(String invContent) {
		this.invContent = invContent;
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

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Column(name = "SHOPID", length = 20)
	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}