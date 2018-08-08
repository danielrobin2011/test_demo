package com.tricon.BikeDemo.daoimpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tricon.BikeDemo.dao.IBikeDao;
import com.tricon.BikeDemo.model.Bike;



@Repository
public class BikeDao implements IBikeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private static final String FETCH_STUDENT="select * from bike";
	
	@Override
	public List<Bike> getBikeDetails() {
		return this.jdbcTemplate.query(FETCH_STUDENT, new RowMapper<Bike>() {
			public Bike mapRow(ResultSet rs, int rowNum) throws SQLException {
			Bike s=new Bike();
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setModel(rs.getString("modal"));
			return s;
			}
		});
		
	}
	@Override
	public String getBikeAdd(Bike obj) {
		
			jdbcTemplate.execute("INSERT INTO `bike`.`bike` (`id`, `name`, `modal`) VALUES ("+obj.getId()+",'"+obj.getName()+"','"+obj.getModel()+"')");
			return "sucess";
			
			}
	@Override
	public String getBikeDelete(int id) {
		
		jdbcTemplate.execute("delete from bike where id="+id);
		return "deleted sucess";
		
		}
	@Override
	public String getBikeUpdate(Bike obj) {
		
		jdbcTemplate.execute("update bike set name='"+obj.getName()+"',modal='"+obj.getModel()+"'where id="+obj.getId());
		return "update sucess";
		
		}
		

}
