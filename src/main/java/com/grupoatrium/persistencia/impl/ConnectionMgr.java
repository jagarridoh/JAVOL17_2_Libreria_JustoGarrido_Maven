package com.grupoatrium.persistencia.impl;

public class ConnectionMgr {

	private String driver;
	private String url;
	private String usuario;
	private String password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String user) {
		this.usuario = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectionMgr [driver=" + driver + ", url=" + url + ", usuario="
				+ usuario + ", password=" + password + "]";
	}

}
