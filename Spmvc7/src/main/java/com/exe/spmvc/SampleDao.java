package com.exe.spmvc;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    // �@�X�V����
    public void update(){
    	jdbcTemplate.update("insert into sampletable(text) values('fourth text')");
    	System.out.println("�X�V��");
        return;
    }
    
    // �A��������
    public List select(){
        List ret = jdbcTemplate.queryForList("select text from sampletable", String.class);
        return ret;
    }
}

