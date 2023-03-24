package ch18.exercise.example10;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Example10 {
	public static void main(String[] args) throws IOException {

		String origin = "/Users/ksw/Desktop/study/Temp/dir1";
		String copy = "/Users/ksw/Desktop/study/Temp/dir2";

		File dir1 = new File(origin);
		File dir2 = new File(copy);
		boolean run = true;

		while (run) {
			Scanner scan = new Scanner(System.in);
			System.out.print("원본 파일 경로 :  ");
			origin = scan.nextLine();
			System.out.println("복사 파일 경로 : " + copy);
			if (dir1.exists() == false) {
				System.out.println("원본 파일이 존재하지 않습니다.");
				dir1.mkdir();
			} else {
				 Files.copy(dir1.toPath(), dir2.toPath(), StandardCopyOption.REPLACE_EXISTING);
				 System.out.println("복사가 성공되었습니다.");
				 run = false;
			}
			System.out.println();

		}
	}
}
