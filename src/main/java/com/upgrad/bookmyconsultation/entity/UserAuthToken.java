/*
 * Copyright 2018-2019, https://beingtechie.io.
 *
 * File: UserAuthToken.java
 * Date: May 5, 2018
 * Author: Thribhuvan Krishnamurthy
 */
package com.upgrad.bookmyconsultation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;


/**
 * User Entity JPA mapping class.
 **/
@Data
@Entity
@Table(name = "user_auth_token")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	@Column(name = "ACCESS_TOKEN", length = 1000)
	private String accessToken;

	private ZonedDateTime loginAt;

	private ZonedDateTime expiresAt;

	private ZonedDateTime logoutAt;
}
