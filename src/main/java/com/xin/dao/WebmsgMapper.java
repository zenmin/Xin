package com.xin.dao;

import com.xin.pojo.Webmsg;
import com.xin.pojo.WebmsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebmsgMapper {
    long countByExample(WebmsgExample example);

    int deleteByExample(WebmsgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Webmsg record);

    int insertSelective(Webmsg record);

    List<Webmsg> selectByExample(WebmsgExample example);

    Webmsg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Webmsg record, @Param("example") WebmsgExample example);

    int updateByExample(@Param("record") Webmsg record, @Param("example") WebmsgExample example);

    int updateByPrimaryKeySelective(Webmsg record);

    int updateByPrimaryKey(Webmsg record);
}