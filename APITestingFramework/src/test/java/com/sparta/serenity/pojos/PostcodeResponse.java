package com.sparta.serenity.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostcodeResponse{

	@JsonProperty("result")
	private Result result;

	@JsonProperty("status")
	private int status;

	public Result getResult(){
		return result;
	}

	public int getStatus(){
		return status;
	}
}