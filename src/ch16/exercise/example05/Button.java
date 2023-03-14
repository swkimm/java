package ch16.exercise.example05;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
