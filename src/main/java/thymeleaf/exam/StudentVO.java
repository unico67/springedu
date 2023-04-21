package thymeleaf.exam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentVO {	
	@NonNull
	private String name;
	@NonNull
	private String addr;
	private int age;
	private String favoriteSubject;
	private String[] favoriteColor;

}
