package it.dstech.main;

import it.dstech.config.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		HibernateUtil.getSessionFactory();
		HibernateUtil.shutdown();

	}

}
