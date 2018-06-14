package com.algaworks.compras;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Checkout checkout = context.getBean(Checkout.class);
		checkout.finalizar();
		
		((ConfigurableApplicationContext) context).close();
	}
	
}
