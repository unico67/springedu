package com.example.springedu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
	private String userName;
	private String address;
	private String[] favoriteFruit;
}
