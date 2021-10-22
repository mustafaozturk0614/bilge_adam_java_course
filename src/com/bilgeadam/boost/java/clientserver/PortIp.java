package com.bilgeadam.boost.java.clientserver;

import java.time.LocalDate;

public class PortIp {
	private int id;
	private String ipAdress;
	private int port;
	private LocalDate logsDate;
	
	@Override
	public String toString() {
		return "PortIp [id=" + id + ", ipAdress=" + ipAdress + ", port=" + port + ", logsDate=" + logsDate + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIpAdress() {
		return ipAdress;
	}
	
	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public LocalDate getLogsDate() {
		return logsDate;
	}
	
	public void setLogsDate(LocalDate logsDate) {
		this.logsDate = logsDate;
	}
	
}
