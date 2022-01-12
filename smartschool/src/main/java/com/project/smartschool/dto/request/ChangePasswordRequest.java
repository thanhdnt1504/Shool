package com.project.smartschool.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePasswordRequest {

	private String id;
	
	private String oldPassword;
	
	private String newPassword;
}
