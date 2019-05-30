package cn.com.service.impl;

import org.springframework.stereotype.Service;

import cn.com.NacosApi;
import cn.com.service.NacosService;

/**
 * @author yulong
 */
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = NacosApi.class)
@Service
public class NacosServiceImpl implements NacosService, NacosApi {
	@Override
	public String getNacosData() {
		return "nacos data test success";
	}

	@Override
	public String getNacosApi() {
		return "nacos api ";
	}

}