package com.anudipspringdb.daoimpl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.anudipspringdb.dao.BookDao;
import com.anudipspringdb.entity.Book;
import org.hibernate.SessionFactory;

public class BookDaoImpl implements BookDao {

	
		 private HibernateTemplate hibernateTemlate;
		 public void setSessionFactory(SessionFactory sessionFactoy) {
			 this.hibernateTemlate=new HibernateTemplate(sessionFactoy);
		 }
		@Override
		public void addBook(Book book) {
			hibernateTemlate.saveOrUpdate(book);
			
		}
		 


}
