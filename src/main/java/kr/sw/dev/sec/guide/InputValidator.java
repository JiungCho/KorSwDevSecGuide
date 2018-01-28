package kr.sw.dev.sec.guide;

/**
 * 전자정부 SW 개발ㆍ운영자를 위한 소프트웨어 개발보안 가이드 (2016년 12월)
 * 제1절 입력데이터 검증 및 표현 관련 유틸리티
 * 1. DB : 
 * 2. 경로 조작 및 자원 삽입 : fileName
 * 3. 크로스사이트 스크립트 : 
 * 4. 운영체제 명령어 삽입 : 
 * 5. 위험한 형식 파일 업로드 : 
 * 6. 신뢰되지 않는 URL 주소로 자동접속 연결 :
 * 7. XQuery 삽입 :
 * 8. XPath 삽입 : 
 * 9. LDAP 삽입 : 
 * 10. 크로스사이트 요청위조 :
 * 11. HTTP 응답분할 : 
 * 12. 정수형 오버플로우 :
 * 13. 보안기능 결정에 사용되는 부적절한 입력값 :
 * 14. 메모리 버퍼 오버플로우 :
 * 15. 포맷 스트링 삽입 :
 * 
 * @author Jiung Cho
 * @version 1.0
 */
public class InputValidator {
	
	/**
	 * <pre>
	 * 입력 제한을 두어 외부 입력에 의한 경로 조작 및 자원 삽입 방지<br>
	 * 입력 제한 문자 : \r \n ../ ..\ &lt; &gt; &quot; : ? * \ /
	 * </pre>
	 * @param 	fileName 외부 입력 된 파일명
	 * @return	가공된 파일명
	 */
	public static String fileName(String fileName) {
		
		if(fileName == null) {
			return "";
		}
		
		fileName = fileName.replace("\r", "");
		fileName = fileName.replace("\n", "");
		fileName = fileName.replace("../", "");
		fileName = fileName.replace("..\\", "");
		fileName = fileName.replace("<", "");
		fileName = fileName.replace(">", "");
		fileName = fileName.replace(":", "");
		fileName = fileName.replace("\"", "");
		fileName = fileName.replace("?", "");
		fileName = fileName.replace("*", "");
		fileName = fileName.replace("\\", "");
		fileName = fileName.replace("/", "");
		
		return fileName;
	}
}
