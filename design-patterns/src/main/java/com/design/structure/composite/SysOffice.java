package com.design.structure.composite;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Title: SysOffice
 * @Description: 组织机构
 * @Author: yj
 * @Date: 2023/5/20 20:45
 * @Version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SysOffice {
	public String id;
	public String name;
	public String parentId;
	public List<SysOffice> childs;

}