package com.productapp.proxy;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.productapp.dto.Coupon;
@Service
public class CouponServiceFallBack implements CouponServiceProxy{

	@Override
	public Coupon getCouponByCode(String couponCode) {
		System.out.println("--------------fallback response-------------");
		 return new Coupon("SUP10", 10, LocalDateTime.now());
	}

}
