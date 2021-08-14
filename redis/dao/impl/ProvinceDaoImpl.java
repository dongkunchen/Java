package tw.dongkun.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import tw.dongkun.dao.ProvinceDao;
import tw.dongkun.domin.Province;
import tw.dongkun.util.JDBCUtils;

import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {

    //1.聲明成員變量 jdbctemplate
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Province> findAll() {
        //1.定義sql
        String sql = "select * from redisdemo";
        //2.執行sql
        List<Province> list = template.query(sql, new BeanPropertyRowMapper<Province>(Province.class));
        return list;
    }
}
