package com.open.iot.modelandutils.base;

import java.io.Serializable;

import lombok.Data;

/**
 * 
* @ClassName: PageRequest 
* @Description: 分页DTO，条件查询可继承
* @author huy
* @date 2019年7月28日 下午1:22:05 
*
 */
@Data
public class PageRequest implements Serializable{

	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	* @date 2019年6月24日  
	*/
	private static final long serialVersionUID = -5094704058177358787L;

	private int pageNum = 1;
	
	private int pageSize = 20;
}
