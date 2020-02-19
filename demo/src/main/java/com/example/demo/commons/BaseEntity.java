package com.example.demo.commons;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	@Column(nullable = true)
	private String createdByUserName;

	@Column(nullable = true)
	private String createdById;

	@Column(nullable = true)
	private String updatedByUserName;

	@Column(nullable = true)
	private String updatedById;

	private RecordStatus recordStatus;

//	private String SequantialId;	

	public String getId() {
		return id;
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

	public void setId(String id) {
		this.id = id;
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
		return recordStatus;
	}

	public void setRecordStatus(RecordStatus recordStatus) {
		this.recordStatus = recordStatus;
	}

	public void generateId() {

		this.setId(UUID.randomUUID().toString());

		this.setCreatedDate(LocalDateTime.now());

//		this.setSequantialId(getId());
	}

	public void update(String id, LocalDateTime createdDate, String createdById, String createdByUserName,
			String updatedById, String updatedByUserName) {

		this.setId(id);

		this.setUpdatedDate(LocalDateTime.now());

		this.setCreatedDate(createdDate);

		this.setCreatedById(createdById);

		this.setCreatedByUserName(createdByUserName);

		this.setUpdatedById(updatedById);

		this.setUpdatedByUserName(updatedByUserName);

	}

//	public String getSequantialId() {
//		return SequantialId;
//	}
//
//	public void setSequantialId(String sequantialId) {
//		SequantialId = sequantialId;
//	}

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
