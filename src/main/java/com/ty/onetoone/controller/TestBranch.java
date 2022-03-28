package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestBranch {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Branch branch = new Branch();
		branch.setName("TYS");
		branch.setPhone(9988);
		
		Address address = new Address();
		address.setArea("BTM");
		address.setPin(9922);
		address.setState("KA");
		
		branch.setAddress(address);
		
		entityTransaction.begin();
		
		entityManager.persist(branch);
		entityManager.persist(address);
		
		entityTransaction.commit();
		
	}
}
