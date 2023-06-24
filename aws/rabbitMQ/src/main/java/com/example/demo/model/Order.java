package com.example.demo.model;

public class Order {
	private String orderid;
	private String order_name;
	private Long qty;
	private Long price;
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", order_name=" + order_name + ", qty=" + qty + ", price=" + price + "]";
	}
	public Order(String orderid, String order_name, Long qty, Long price) {
		super();
		this.orderid = orderid;
		this.order_name = order_name;
		this.qty = qty;
		this.price = price;
	}
	public Order() {
	// TODO Auto-generated constructor stub
	}
}
