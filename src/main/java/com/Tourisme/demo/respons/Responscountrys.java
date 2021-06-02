package com.Tourisme.demo.respons;

import com.Tourisme.demo.Model.Pays;

public class Responscountrys {
	public int countCitys;
	public Pays pays ;
	
	
	public Responscountrys(int countCitys, Pays pays) {
		this.countCitys = countCitys;
		this.pays = pays;
	}
	
	public int getCountCitys() {
		return countCitys;
	}
	public void setCountCitys(int countCitys) {
		this.countCitys = countCitys;
	}
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
}
