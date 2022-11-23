//package com.bowlcome.demo.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.bowlcome.demo.Entity.UserEntity;
//
//
//@Repository
//public interface UserRepository extends JpaRepository<UserEntity, Long> {
//	
//	UserEntity findByUserId(String userId);
//	UserEntity findByUserIdAndPassword(String userId, String password);
//	UserEntity findByEmail(String email);
//	
//	Boolean existsByNickName(String nickName);
//	Boolean existsByUserId(String userId);
//	Boolean existsByEmail(String emali);
//	
//}
