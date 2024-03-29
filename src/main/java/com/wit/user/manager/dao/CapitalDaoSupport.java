package com.wit.user.manager.dao;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.exception.ServiceErrorTypes;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.util.List;

public class CapitalDaoSupport extends JdbcDaoSupport {

    public CapitalDaoSupport(DataSource datasource) {
        setDataSource(datasource);
    }

    public <T> List<T> queryForList(String query, RowMapper<T> mapper) throws ApiException {
        try {
            return getJdbcTemplate().query(query, mapper);

        } catch (DataAccessException e) {
            throw new ApiException(e, ServiceErrorTypes.DATA_NOT_FOUND);
        }
    }

    public <T> T queryForObject(String query, Object[] objArray, RowMapper<T> mapper) throws ApiException {
        try {
            return getJdbcTemplate().queryForObject(query, objArray, mapper);

        } catch (DataAccessException e) {
            throw new ApiException(e, ServiceErrorTypes.DATA_NOT_FOUND);
        }
    }

    public <T> List<T> queryForParams(String query, Object[] params, RowMapper<T> mapper) throws ApiException {
        try {
            return getJdbcTemplate().query(query, params, mapper);

        } catch (DataAccessException e) {
            throw new ApiException(e, ServiceErrorTypes.DATA_NOT_FOUND);
        }
    }

    public int update(String query, Object[] params)
    {
        return getJdbcTemplate().update(query, params);
    }

    public long insert(String query, Object[] params)
    {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        getJdbcTemplate().update(query, params, keyHolder);
        return (long) keyHolder.getKey();
    }

}
