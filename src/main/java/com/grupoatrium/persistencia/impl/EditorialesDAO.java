package com.grupoatrium.persistencia.impl;

public class EditorialesDAO {

	ConnectionMgr connMgr;

	public ConnectionMgr getConnMgr() {
		return connMgr;
	}

	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}

	@Override
	public String toString() {
		return "EditorialesDAO [connMgr=" + connMgr + "]";
	}
	
	
	
}
