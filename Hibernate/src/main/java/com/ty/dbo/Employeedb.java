package com.ty.dbo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employeedb {
	
		@Id
		private int idno;
		private String name;
		private long phone_number;
		public int getIdno() {
			return idno;
		}
		public void setIdno(int idno) {
			this.idno = idno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(long phone_number) {
			this.phone_number = phone_number;
		}
	
@Override		
public String toString()
{
	return ""+idno+"  "+name+"  "+phone_number;
}
	

}
