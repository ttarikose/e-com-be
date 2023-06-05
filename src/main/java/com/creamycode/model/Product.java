package com.creamycode.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_product")
public class Product {

	private Long id;

	private String stu;

	private String title;

	private String short_desc;

	private String long_desc;

	private BigDecimal price;

	private BigDecimal tax;

	private int discount;

	private int stock_amount;

	private int stock_alarm_limit;

	private boolean featured;

	private String slug;

	private String image;

}
