package com.springboot.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;


//CREATE TABLE log(request text, response text, create_time timestamp, PRIMARY KEY(request, response));

@Table("log")
public class Log implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PrimaryKeyColumn(name = "request", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@Column("request")
	private String request;

	@PrimaryKeyColumn(name = "response", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	@Column("response")
	private String response;

	@Column("create_time")
	private Date createTime;

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}