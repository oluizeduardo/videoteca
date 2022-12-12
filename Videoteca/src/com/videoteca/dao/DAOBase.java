package com.videoteca.dao;

public interface DAOBase<T> {

	void save(T newitem);
	
	boolean delete(T item);
	
	boolean update(T item);
	
	T findById(long idItem);
	
}
