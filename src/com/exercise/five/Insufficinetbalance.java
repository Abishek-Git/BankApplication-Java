package com.exercise.five;

public class Insufficinetbalance extends Exception {
		private String msg = "Insufficinetbalance";
		public Insufficinetbalance(String str){
			this.msg = str;
		}
		public Insufficinetbalance() {}
		public String getMsg() {
			return this.msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		
	

}
