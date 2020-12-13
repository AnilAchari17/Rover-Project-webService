package com.example.RoverProject.Bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PerformsBean {
	
	@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
	private  CollectSampleBean collect_sample ;
	
	@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
	private ItemUsage item_usage;

	public ItemUsage getItem_usage() {
		return item_usage;
	}

	public void setItem_usage(ItemUsage item_usage) {
		this.item_usage = item_usage;
	}

	public CollectSampleBean getCollect_sample() {
		return collect_sample;
	}

	public void setCollect_sample(CollectSampleBean collect_sample) {
		this.collect_sample = collect_sample;
	}

}
