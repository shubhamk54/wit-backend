package com.wit.user.manager.mapper;

        import org.springframework.jdbc.core.RowMapper;

        import java.sql.ResultSet;
        import java.sql.SQLException;

public class UserIdRowMapper implements RowMapper<Integer> {

    @Override
    public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
        return rs.getInt("user_id");
    }
}