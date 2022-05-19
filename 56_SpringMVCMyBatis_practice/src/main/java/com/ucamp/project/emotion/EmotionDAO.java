package com.ucamp.project.emotion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public interface EmotionDAO {

	// 감정 8개 추출 / 새로고침
	public String getEmotionName(@Param("mainEmotion")String mainEmotion) throws SQLException;
	public boolean getMyEmotionName(@Param("id")String id) throws SQLException;
	
}
