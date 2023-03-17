package ch15.lecture.p05queue;

import java.util.*;

public class C01Queue {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		// offer : 새 아이템 삽입
		queue.offer("kang");
		// poll : 기존 아이템 삭제(꺼내기) 
		String s1 = queue.poll();
		
		System.out.println(queue.size());
		System.out.println(s1);
		System.out.println();
		
		queue.offer("chae");
		queue.offer("song");
		queue.offer("jeong");
		queue.offer("seo");

		System.out.println(queue.size());
	
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
		// 꺼낸 문서 전체 탐색 
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
		
	}
}
