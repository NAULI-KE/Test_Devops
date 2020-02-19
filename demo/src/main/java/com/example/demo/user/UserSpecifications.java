package com.example.demo.user;

import com.example.demo.commons.RecordStatus;
import com.example.demo.utils.SearchUtility;

public class UserSpecifications {

	public static org.springframework.data.jpa.domain.Specification<User> withTextLike(String text) {
		String containsLikePattern = SearchUtility.getContainsLikePattern(text);
		return (root, query, cb) -> {
			return cb.like(root.get(UserAttributes_.FirstName), containsLikePattern);
		};
	}

	public static org.springframework.data.jpa.domain.Specification<User> withRecordStatus(
			RecordStatus recordStatus) {
		return (root, query, cb) -> {
			return cb.equal(root.get(UserAttributes_.RecordStatus), recordStatus);
		};
	}
}
