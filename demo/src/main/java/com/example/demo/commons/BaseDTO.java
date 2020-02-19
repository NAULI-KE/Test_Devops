package com.example.demo.commons;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class BaseDTO {

	private String id;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updatedDate;

	private String createdByUserName;

	private String createdById;

	private String updatedByUserName;

	private String updatedById;

	private RecordStatus RecordStatus;

	private String SequantialId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedByUserName() {
		return createdByUserName;
	}

	public void setCreatedByUserName(String createdByUserName) {
		this.createdByUserName = createdByUserName;
	}

	public String getUpdatedByUserName() {
		return updatedByUserName;
	}

	public void setUpdatedByUserName(String updatedByUserName) {
		this.updatedByUserName = updatedByUserName;
	}

	public RecordStatus getRecordStatus() {
		return RecordStatus;
	}

	public void setRecordStatus(RecordStatus recordStatus) {
		RecordStatus = recordStatus;
	}

	public String getSequantialId() {
		return SequantialId;
	}

	public void setSequantialId(String sequantialId) {
		SequantialId = sequantialId;
	}

	public String getCreatedById() {
		return createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public String getUpdatedById() {
		return updatedById;
	}

	public void setUpdatedById(String updatedById) {
		this.updatedById = updatedById;
	}

}