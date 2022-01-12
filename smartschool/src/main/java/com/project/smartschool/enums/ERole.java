package com.project.smartschool.enums;

public enum ERole {
	
	// USER
	ROLE_USER_VIEW(0),
	ROLE_USER_CREATE(1),
	ROLE_USER_UPDATE(2), 
	ROLE_USER_DELETE(3),
	
	ROLE_BLOCK_VIEW(4),
	ROLE_BLOCK_CREATE(5),
	ROLE_BLOCK_UPDATE(6), 
	ROLE_BLOCK_DELETE(7),
	
	ROLE_CLASS_VIEW(12),
	ROLE_CLASS_CREATE(9),
	ROLE_CLASS_UPDATE(10), 
	ROLE_CLASS_DELETE(11),
	
	ROLE_MAJOR_VIEW(8),
	ROLE_MAJOR_CREATE(13),
	ROLE_MAJOR_UPDATE(14),
	ROLE_MAJOR_DELETE(15),
	
	ROLE_MATHDESIGN_VIEW(16),
	ROLE_MATHDESIGN_CREATE(17),
	ROLE_MATHDESIGN_UPDATE(18),
	ROLE_MATHDESIGN_DELETE(19),
	
	ROLE_CHAPTER_VIEW(39),
	ROLE_CHAPTER_CREATE(40),
	ROLE_CHAPTER_UPDATE(41),
	ROLE_CHAPTER_DELETE(42),
	
	ROLE_TEST_VIEW(20),
	ROLE_TEST_CREATE(21),
	ROLE_TEST_UPDATE(22),
	ROLE_TEST_DELETE(23),
	
	ROLE_SCORE_VIEW(24),
	ROLE_SCORE_CREATE(25),
	ROLE_SCORE_UPDATE(43),
	ROLE_SCORE_DELETE(26),
	
	ROLE_KNOWLEGDE_VIEW(27),
	ROLE_KNOWLEGDE_CREATE(28),
	ROLE_KNOWLEGDE_UPDATE(29),
	ROLE_KNOWLEGDE_DELETE(30),
	
	ROLE_STUDENT_VIEW(31),
	ROLE_STUDENT_CREATE(32),
	ROLE_STUDENT_UPDATE(33),
	ROLE_STUDENT_DELETE(34),
	
	ROLE_TEACHER_VIEW(35),
	ROLE_TEACHER_CREATE(36),
	ROLE_TEACHER_UPDATE(37),
	ROLE_TEACHER_DELETE(38),
	
	ROLE_ROLEGROUP_VIEW(44),
	ROLE_ROLEGROUP_CREATE(45),
	ROLE_ROLEGROUP_UPDATE(46),
	ROLE_ROLEGROUP_DELETE(47),

	ROLE_REVIEWQUESTION_VIEW(48),
	ROLE_REVIEWQUESTION_CREATE(49),
	ROLE_REVIEWQUESTION_UPDATE(50),
	ROLE_REVIEWQUESTION_DELETE(51),
	
	ROLE_POINT_VIEW(52),
	ROLE_POINT_CREATE(53),
	ROLE_POINT_UPDATE(54),
	ROLE_POINT_DELETE(55),
	
	ROLE_COMMENT_VIEW(56),
	ROLE_COMMENT_CREATE(57),
	ROLE_COMMENT_UPDATE(58),
	ROLE_COMMENT_DELETE(59),
	
	ROLE_TEST_TYPE_VIEW(60),
	ROLE_TEST_TYPE_CREATE(61),
	ROLE_TEST_TYPE_UPDATE(62),
	ROLE_TEST_TYPE_DELETE(63),
	//
    ;	
	
	private final int code;

    private ERole(int code) {
        this.code = code;
    }

	public int getCode() {
		return code;
	}    
	
	public static class Names{
		
		public  final static String ROLE_USER_VIEW = "ROLE_USER_VIEW";
		public  final static String ROLE_USER_CREATE = "ROLE_USER_CREATE";
		public  final static String ROLE_USER_UPDATE = "ROLE_USER_UPDATE";
		public  final static String ROLE_USER_DELETE = "ROLE_USER_DELETE";
		
		public  final static String ROLE_BLOCK_VIEW = "ROLE_BLOCK_VIEW";
		public  final static String ROLE_BLOCK_CREATE = "ROLE_BLOCK_CREATE";
		public  final static String ROLE_BLOCK_UPDATE = "ROLE_BLOCK_UPDATE";
		public  final static String ROLE_BLOCK_DELETE = "ROLE_BLOCK_DELETE";
		
		public  final static String ROLE_CLASS_VIEW = "ROLE_CLASS_VIEW";
		public  final static String ROLE_CLASS_CREATE = "ROLE_CLASS_CREATE";
		public  final static String ROLE_CLASS_UPDATE = "ROLE_CLASS_UPDATE";
		public  final static String ROLE_CLASS_DELETE = "ROLE_CLASS_DELETE";
		
		public  final static String ROLE_MAJOR_VIEW = "ROLE_MAJOR_VIEW";
		public  final static String ROLE_MAJOR_CREATE = "ROLE_MAJOR_CREATE";
		public  final static String ROLE_MAJOR_UPDATE = "ROLE_MAJOR_UPDATE";
		public  final static String ROLE_MAJOR_DELETE = "ROLE_MAJOR_DELETE";
		
		public  final static String ROLE_MATHDESIGN_VIEW = "ROLE_MATHDESIGN_VIEW";
		public  final static String ROLE_MATHDESIGN_CREATE = "ROLE_MATHDESIGN_CREATE";
		public  final static String ROLE_MATHDESIGN_UPDATE = "ROLE_MATHDESIGN_UPDATE";
		public  final static String ROLE_MATHDESIGN_DELETE = "ROLE_MATHDESIGN_DELETE";
		
		public  final static String ROLE_CHAPTER_VIEW = "ROLE_MATHDESIGN_VIEW";
		public  final static String ROLE_CHAPTER_CREATE = "ROLE_MATHDESIGN_CREATE";
		public  final static String ROLE_CHAPTER_UPDATE = "ROLE_MATHDESIGN_UPDATE";
		public  final static String ROLE_CHAPTER_DELETE = "ROLE_MATHDESIGN_DELETE";


		public  final static String ROLE_TEST_VIEW = "ROLE_TEST_VIEW";
		public  final static String ROLE_TEST_CREATE = "ROLE_TEST_CREATE";
		public  final static String ROLE_TEST_UPDATE = "ROLE_TEST_UPDATE";
		public  final static String ROLE_TEST_DELETE = "ROLE_TEST_DELETE";
		
		public  final static String ROLE_TEST_TYPE_VIEW = "ROLE_TEST_TYPE_VIEW";
		public  final static String ROLE_TEST_TYPE_CREATE = "ROLE_TEST_TYPE_CREATE";
		public  final static String ROLE_TEST_TYPE_UPDATE = "ROLE_TEST_TYPE_UPDATE";
		public  final static String ROLE_TEST_TYPE_DELETE = "ROLE_TEST_TYPE_DELETE";
		
		public  final static String ROLE_SCORE_VIEW = "ROLE_SCORE_VIEW";
		public  final static String ROLE_SCORE_CREATE = "ROLE_SCORE_CREATE";
		public  final static String ROLE_SCORE_UPDATE = "ROLE_SCORE_UPDATE";
		public  final static String ROLE_SCORE_DELETE = "ROLE_SCORE_DELETE";
		
		public  final static String ROLE_KNOWLEGDE_VIEW = "ROLE_KNOWLEGDE_VIEW";
		public  final static String ROLE_KNOWLEGDE_CREATE = "ROLE_KNOWLEGDE_CREATE";
		public  final static String ROLE_KNOWLEGDE_UPDATE = "ROLE_KNOWLEGDE_UPDATE";
		public  final static String ROLE_KNOWLEGDE_DELETE = "ROLE_KNOWLEGDE_DELETE";
		
		public  final static String ROLE_STUDENT_VIEW = "ROLE_STUDENT_VIEW";
		public  final static String ROLE_STUDENT_CREATE = "ROLE_STUDENT_CREATE";
		public  final static String ROLE_STUDENT_UPDATE = "ROLE_STUDENT_UPDATE";
		public  final static String ROLE_STUDENT_DELETE = "ROLE_STUDENT_DELETE";
		
		public  final static String ROLE_TEACHER_VIEW = "ROLE_TEACHER_VIEW";
		public  final static String ROLE_TEACHER_CREATE = "ROLE_TEACHER_CREATE";
		public  final static String ROLE_TEACHER_UPDATE = "ROLE_TEACHER_UPDATE";
		public  final static String ROLE_TEACHER_DELETE = "ROLE_TEACHER_DELETE";
		
		public  final static String ROLE_ROLEGROUP_VIEW = "ROLE_ROLEGROUP_VIEW";
		public  final static String ROLE_ROLEGROUP_CREATE = "ROLE_ROLEGROUP_CREATE";
		public  final static String ROLE_ROLEGROUP_UPDATE = "ROLE_ROLEGROUP_UPDATE";
		public  final static String ROLE_ROLEGROUP_DELETE = "ROLE_ROLEGROUP_DELETE";
		
		public  final static String ROLE_REVIEWQUESTION_VIEW = "ROLE_REVIEWQUESTION_VIEW";
		public  final static String ROLE_REVIEWQUESTION_CREATE = "ROLE_REVIEWQUESTION_CREATE";
		public  final static String ROLE_REVIEWQUESTION_UPDATE = "ROLE_REVIEWQUESTION_UPDATE";
		public  final static String ROLE_REVIEWQUESTION_DELETE = "ROLE_REVIEWQUESTION_DELETE";
		
		public  final static String ROLE_POINT_VIEW = "ROLE_POINT_VIEW";
		public  final static String ROLE_POINT_CREATE = "ROLE_POINT_CREATE";
		public  final static String ROLE_POINT_UPDATE = "ROLE_POINT_UPDATE";
		public  final static String ROLE_POINT_DELETE = "ROLE_POINT_DELETE";
		
		public  final static String ROLE_COMMENT_VIEW = "ROLE_COMMENT_VIEW";
		public  final static String ROLE_COMMENT_CREATE = "ROLE_COMMENT_CREATE";
		public  final static String ROLE_COMMENT_UPDATE = "ROLE_COMMENT_UPDATE";
		public  final static String ROLE_COMMENT_DELETE = "ROLE_COMMENT_DELETE";

	}
}




