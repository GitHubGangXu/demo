package com.goldgov.hellowork;

import org.springframework.boot.SpringApplication;

import com.goldgov.origin.core.OriginApplication;
import com.goldgov.origin.core.discovery.IsWebGate;

public class test extends OriginApplication implements IsWebGate{
	public static void main(String[] args) {
		SpringApplication.run(new Object[]{test.class}, args);
	}
}
