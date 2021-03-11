package com.luv2code.SpringWithEHCache.Config;


import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CustomCacheEventLogger implements CacheEventListener<Object, Object>{

	private Logger LOG = LoggerFactory.getLogger(CustomCacheEventLogger.class);
	
	@Override
	public void onEvent(CacheEvent<? , ? > cacheEvent) {
		LOG.info("custom Caching event {} {} {} {} ", cacheEvent.getType() , cacheEvent.getKey() , cacheEvent.getOldValue() , cacheEvent.getNewValue());
		
	}

}