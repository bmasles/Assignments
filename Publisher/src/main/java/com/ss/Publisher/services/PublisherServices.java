package com.ss.Publisher.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.ss.Publisher.dao.PublisherDAO;
import com.ss.Publisher.entity.Publisher;

@RestController
public class PublisherServices {

	private ConnectionUtil connUtil = new ConnectionUtil();
	
//	public List<Publisher> readPublisher() {
//		try (Connection conn = connUtil.getConnection()) {
//			PublisherDAO pdao = new PublisherDAO(conn);
//			return pdao.readPublisher();
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Could not read publisher");
//		}
//		return null;
//	}
	
	public Publisher readPublisherById(int id) {
		return null;
	}

}
