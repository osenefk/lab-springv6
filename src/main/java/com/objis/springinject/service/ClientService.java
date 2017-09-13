package com.objis.springinject.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.objis.springinject.dao.IClientDao;
import com.objis.springinject.domaine.Employe;

@Named(value = "service")
public class ClientService implements IServiceClient {

	@Inject
	IClientDao dao;

	public IClientDao getDao() {
		return dao;
	}

	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	public void sauverEmploye(Employe employe) {
		dao.saveEmploye(employe);
	}

}
