package com.lanbao.redis.vo;

// Generated 2014-10-9 18:51:28 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ActRuVariable generated by hbm2java
 */
@Entity
@Table(name = "act_ru_variable", catalog = "jshoper3")
public class ActRuVariable implements java.io.Serializable {

	private String id;
	private ActRuExecution actRuExecutionByExecutionId;
	private ActRuExecution actRuExecutionByProcInstId;
	private ActGeBytearray actGeBytearray;
	private Integer rev;
	private String type;
	private String name;
	private String taskId;
	private Double double_;
	private Long long_;
	private String text;
	private String text2;

	public ActRuVariable() {
	}

	public ActRuVariable(String id, String type, String name) {
		this.id = id;
		this.type = type;
		this.name = name;
	}

	public ActRuVariable(String id, ActRuExecution actRuExecutionByExecutionId,
			ActRuExecution actRuExecutionByProcInstId,
			ActGeBytearray actGeBytearray, Integer rev, String type,
			String name, String taskId, Double double_, Long long_,
			String text, String text2) {
		this.id = id;
		this.actRuExecutionByExecutionId = actRuExecutionByExecutionId;
		this.actRuExecutionByProcInstId = actRuExecutionByProcInstId;
		this.actGeBytearray = actGeBytearray;
		this.rev = rev;
		this.type = type;
		this.name = name;
		this.taskId = taskId;
		this.double_ = double_;
		this.long_ = long_;
		this.text = text;
		this.text2 = text2;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXECUTION_ID_")
	public ActRuExecution getActRuExecutionByExecutionId() {
		return this.actRuExecutionByExecutionId;
	}

	public void setActRuExecutionByExecutionId(
			ActRuExecution actRuExecutionByExecutionId) {
		this.actRuExecutionByExecutionId = actRuExecutionByExecutionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROC_INST_ID_")
	public ActRuExecution getActRuExecutionByProcInstId() {
		return this.actRuExecutionByProcInstId;
	}

	public void setActRuExecutionByProcInstId(
			ActRuExecution actRuExecutionByProcInstId) {
		this.actRuExecutionByProcInstId = actRuExecutionByProcInstId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BYTEARRAY_ID_")
	public ActGeBytearray getActGeBytearray() {
		return this.actGeBytearray;
	}

	public void setActGeBytearray(ActGeBytearray actGeBytearray) {
		this.actGeBytearray = actGeBytearray;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "TYPE_", nullable = false)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "NAME_", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "TASK_ID_", length = 64)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "DOUBLE_", precision = 22, scale = 0)
	public Double getDouble_() {
		return this.double_;
	}

	public void setDouble_(Double double_) {
		this.double_ = double_;
	}

	@Column(name = "LONG_")
	public Long getLong_() {
		return this.long_;
	}

	public void setLong_(Long long_) {
		this.long_ = long_;
	}

	@Column(name = "TEXT_", length = 4000)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "TEXT2_", length = 4000)
	public String getText2() {
		return this.text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

}
