package com.objis.springinject.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.springinject.domaine.Employe;
import com.objis.springinject.service.IServiceClient;

public class Demo {

	public static void main(String[] args) {

		 Employe emp= new Employe("mbeye", "passer", "Mamadou", "BEYE", "mbeye@objis.com", "Formateur");
		// 1. Chargement du conteneur en 4.0.0
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("demo-beans.xml");

		// 2. Recuperation de bean
		
		IServiceClient service = (IServiceClient) appContext.getBean("service");
		
		// 3. Manipulation du bean
         service.sauverEmploye(emp);
	}

}
