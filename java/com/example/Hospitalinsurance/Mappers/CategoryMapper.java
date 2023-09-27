package com.example.Hospitalinsurance.Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.Hospitalinsurance.model.Categories;

public class CategoryMapper implements RowMapper<Categories> {

	@Override
	public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Categories cs = new Categories();
		cs.setCategoryId(rs.getInt(1));
		cs.setCategoryTitle(rs.getString(2));
		cs.setCategoryDescription(rs.getString(3));
		cs.setCategoryStatus(rs.getString(4));

		return cs;
	}

}