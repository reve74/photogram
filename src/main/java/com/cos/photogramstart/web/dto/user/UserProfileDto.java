package com.cos.photogramstart.web.dto.user;

import com.cos.photogramstart.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserProfileDto {
	private int imageCount;
	private boolean pageOwnerState;
	private boolean subscribeState;
	private int subscribeCount;
	private User user;

}
