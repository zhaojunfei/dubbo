package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.OrderService;

public class OrderServiceImpl implements OrderService {

	public String createOrder(String orderno) {
		
		return "search order number" + orderno;
	}

}
