package com.javaex.ex02;

import java.util.List;

public class AuthorApp {

	public static void main(String[] args) {
		
		AuthorDao authorDao = new AuthorDao();
		
		List<AuthorVo> authorList;
		//리스트출력
		//DB에서 데이터 가져오기
		authorList = authorDao.getAuthorList();
		
		//리스트를 출력
		printList(authorList);
			
		
		
		
		
		//작가등록
		int iCount = authorDao.authorInsert("박수현","하이미디어");
		if(iCount>0) {
			System.out.println("==================");
			System.out.println("[등록되었습니다.]");
			System.out.println("==================");
		}else {
			System.out.println("[관리자에게 문의하세요 (" + iCount + ") ]");
		}
		
		
		//DB에서 데이터 가져오기
		authorList = authorDao.getAuthorList();
		//리스트출력
		printList(authorList);
		
		
		
		
		//작가수정
		int uCount = authorDao.authorUpdate(3, "수현이", "강남하이미디어");
		
		
		//db에서가져오기
		authorList = authorDao.getAuthorList();
		//리스트출력
		printList(authorList);

		
		
		
		//작가삭제
		int dCount = authorDao.authorDelete(3);
		
		
		//db에서가져오기
		authorList = authorDao.getAuthorList();
		//리스트출력
		printList(authorList);
		
		
		/*
		//작가 1명의 정보
		??? = authorDao.getAuthorOne(3);
		*/
		
	}
	public static void printList(List<AuthorVo> authorList) {
		for(int i=0; i<authorList.size(); i++) {
			
			AuthorVo authorVo = authorList.get(i);
			
			int authorId = authorVo.getAuthorId();
			String authorName = authorVo.getAuthorNmae();
			String authorDesc = authorVo.getAuthorDesc();
		
			System.out.println(authorId +"\t"+ authorName +"\t"+ authorDesc);
	
		}
	}
}

