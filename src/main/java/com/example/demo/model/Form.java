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

	  public void sumTotal(){
			total = this.num1 + this.num2;
		    setTotal(total);
	  }
	  public void mainusTotal(){
			total = this.num3 - this.num4;
		    setTotal(total);
	  }
}
