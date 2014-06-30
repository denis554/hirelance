package it.mwt.hirelance.business;

import java.io.Serializable;
import java.util.List;


public class ResponseGrid<R> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String sEcho;
	private long iTotalRecords;
	private long iTotalDisplayRecords;
	private List<R> rows;
	
	public ResponseGrid(String sEcho, long iTotalRecords,
			long iTotalDisplayRecords, List<R> rows) {
		super();
		this.sEcho = sEcho;
		this.iTotalRecords = iTotalRecords;
		this.iTotalDisplayRecords = iTotalDisplayRecords;
		this.rows = rows;
	}

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

	public long getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public long getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public List<R> getRows() {
		return rows;
	}

	public void setRows(List<R> rows) {
		this.rows = rows;
	}
	
	

}
