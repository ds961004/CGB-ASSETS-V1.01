package com.cy.sys.service;

import com.cy.common.vo.PageObject;
import com.cy.sys.entity.SysLog;

public interface SysLogService {
	  /**
     * 通过此方法实现分页查询操作
     * @param name 基于条件查询时的参数名
     * @param pageCurrent 当前的页码值
     * @return 当前页记录+分页信息
     */
	public PageObject<SysLog> findPageObjects(
			 String username,
			 Integer pageCurrent);
	
	public int deleteObjects(Integer...ids);
	
}
