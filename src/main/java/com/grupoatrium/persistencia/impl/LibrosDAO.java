package com.grupoatrium.persistencia.impl;

public class LibrosDAO {
	ConnectionMgr connMgr;

	public ConnectionMgr getConnMgr() {
		return connMgr;
	}

	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}

	@Override
	public String toString() {
		return "LibrosDAO [connMgr=" + connMgr + "]";
	}
	
}
