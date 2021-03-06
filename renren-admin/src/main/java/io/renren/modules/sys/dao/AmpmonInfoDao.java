package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.AmpmonInfoEntity;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-06 09:14:57
 */
public interface AmpmonInfoDao extends BaseMapper<AmpmonInfoEntity> {
	List<AmpmonInfoEntity> calculateComponentQ();
	List<AmpmonInfoEntity> calculateComponentL();
	List<AmpmonInfoEntity> countLastMonthA(@Param("terminalId")String terminalId, @Param("dateyear")String dateyear, @Param("datemonth")String datemonth,@Param("mixturetype")String mixturetype);
}
