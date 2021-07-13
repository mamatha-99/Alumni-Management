package com.POD5.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.POD5.Dao.Authority;

public class authorityMapper implements RowMapper<Authority> {

	@Override
	public Authority mapRow(ResultSet rs, int rowNum) throws SQLException {
		Authority mappedAuthority = new Authority();
		mappedAuthority.setRid(rs.getString("rid"));
		mappedAuthority.setRole(rs.getString("role"));
		return mappedAuthority;
	}
}