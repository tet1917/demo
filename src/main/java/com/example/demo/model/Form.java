package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;



//下のコメントの欄を@getter,@setterでまとめ書き
@Getter
@Setter
public class Form {
	  private double num1 = 0;
	  private double num2 = 0;
	  private double num3 = 0;
	  private double num4 = 0;
	  
	  private double total = 0;
	  boolean check = true;
	  //正規表現
	  
	  

//	  public int getNum1(){
//	    return num1;
//	  }
//
//	  public void setNum1(int num){
//	    this.num1 = num;
//	  }
//
//	  public int getNum2(){
//	    return num2;
//	  }
//
//	  public void setNum2(int num){
//	    this.num2 = num;
//	  }
//
//	  public int getTotal(){
//	    return total;
//	  }
//
//	  public void setTotal(int total){
//	    this.total = total;
//	  }
	  public void sumTotal(){
			total = this.num1 + this.num2;
		    setTotal(total);
	  }
	  public void maiTotal(){
			total = this.num3 - this.num4;
		    setTotal(total);
	  }
}
