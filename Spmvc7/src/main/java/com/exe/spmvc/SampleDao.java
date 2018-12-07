package com.exe.spmvc;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    // ①更新処理
    public void update(){
    	String sql = "insert into sampletable(text) values('fourth text')";
    	jdbcTemplate.update(sql);
    	System.out.println("更新中");
        return;
    }
    
    // ②検索処理
    public List select(){
    	String sql = "select text from sampletable";
        List ret = jdbcTemplate.queryForList(sql, String.class);
        return ret;
    }
}

