 package com.bilgeadam.boost.java.libary;

 public enum ETypeOfBook {
 FİCTİON(1,"kurgu"),NON_FİCTİON(2,"kurgu dışı");
	 final    int id;
		final String name;
	   ETypeOfBook(int id, String name) {
		 this.id=id;
		  this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
 }
