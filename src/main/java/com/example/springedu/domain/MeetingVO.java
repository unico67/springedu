package com.example.springedu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class MeetingVO {
	private int id;
	private String name;
	private String title;
	private String meetingDate;	
}
