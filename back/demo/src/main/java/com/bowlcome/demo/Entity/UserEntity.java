//package com.bowlcome.demo.Entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;
//
//import org.hibernate.annotations.GenericGenerator;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import lombok.Setter;
//import lombok.ToString;
//
//
//@Data
//@Builder
//@Entity
//@Table(name = "User", uniqueConstraints = {@UniqueConstraint(name="USERID_NICKNAME_EMAIL_UNIQUE",columnNames = {"USERID","NICKNAME","EMAIL"})})
//@NoArgsConstructor @AllArgsConstructor
//public class UserEntity {
//	
//	@GeneratedValue(generator = "system-uuid")
//	@GenericGenerator(name = "system-uuid", strategy = "uuid")
//	private String Id;
//	
//	@Id
//	@Column(name = "USER_ID" ,nullable = false)
//	private String userId;
//	
//	@Column(nullable = false)
//	private	String pwd;
//	
//	@Column(nullable = false)
//	private String nickName;
//	
//	@Column(nullable = false)
//	private String email;
//	
//	@Column(nullable = false)
//	private int age;
//	
//	@Column(nullable = false)
//	private String phoneNumber;
//	
//	@Column(name = "USER_GENDER")
//	private Gender gender;
//	
//	@Column(name = "USER_BOWLING_CARRER")
//	private String career;
//	
//	@Column
//	private String address;
//	
//	
//	@Data
//	@Builder
//	public static class Requests {
//		
//		@NotBlank(message = "ID�� ���� �� NULL���� ������� ����")
//		private String userId;
//		
//		@NotBlank(message = "PASSWORD�� ���� �� NULL���� ������� ����")
//		private String pwd;
//		
//		@NotBlank(message = "USERNAME�� ���� �� NULL���� ������� ����")
//		private String nickName;
//		
//		@Email
//		@NotBlank(message = "EMAIL�� ���� �� NULL���� ������� ����")
//		private String email;
//		
//		
//		@NotBlank(message = "AGE�� ���� �� NULL���� ������� ����")
//		@Size(min = 0, max = 100, message = "0<= ���� <=100")
//		private int age;
//		
//		@NotBlank(message = "PHONE_NUMBER�� ���� �� NULL ���� ������� ����")
//		@Pattern(regexp = "^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$")
//		private String phoneNumber;
//		
//		private Gender gender;
//		
//		private String career;
//		
//		@NotBlank(message = "address�� ���� �� NULL���� ������� ����")
//		private String address;
//		
//		
//		public static UserEntity toEntity(final Requests request) {
//			return UserEntity.builder()
//					.userId(request.getUserId())
//					.pwd(request.getPwd())
//					.nickName(request.getNickName())
//					.email(request.getEmail())
//					.age(request.getAge())
//					.phoneNumber(request.getPhoneNumber())
//					.gender(request.getGender())
//					.career(request.getCareer())
//					.address(request.getAddress())
//					.build();	
//			
//		}
//		
//		
//	}
//	
//	@Data
//	@Builder
//	public static class Response{
//		private String userId;
//		private String nickName;
//		private String email;
//		private int age;
//		private String phoneNumber;
//		private Gender gender;
//		private String career;
//		private String address;
//			
//		public static UserEntity.Response toResponse(final UserEntity user){
//			return UserEntity.Response.builder()
//					.userId(user.getUserId())
//					.nickName(user.getNickName())
//				    .email(user.getEmail())
//				    .age(user.getAge())
//				    .phoneNumber(user.getPhoneNumber())
//				    .gender(user.getGender())
//				    .career(user.getCareer())
//				    .address(user.getAddress())
//				    .build();
//		}
//		
//
//	}
//	
//}