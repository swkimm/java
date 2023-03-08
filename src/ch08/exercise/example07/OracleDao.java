package ch08.exercise.example07;

public class OracleDao implements DataAccessObject {
	String str = "Oracle";
	@Override
	public void select() {
		System.out.println(str + " DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println(str + " DB에서 삽입");
		
	}
	@Override
	public void update() {
		System.out.println(str + " DB에서 수정");
		
	}
	@Override
	public void delete() {
		System.out.println(str + " DB에서 삭제");
		
	}
}
