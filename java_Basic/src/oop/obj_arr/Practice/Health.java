package oop.obj_arr.Practice;

public class Health {
	
	private String name;
	private int bench;
	private int dead;
	private int squat;
	private int total;
	
	public Health() {}
	
	public Health(String name, int bench, int dead, int squat ) {
		super();
		this.name = name;
		this.bench	= bench;
		this.dead = dead;
		this.squat = squat;
		this.total = bench + dead + squat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBench() {
		return bench;
	}

	public void setBench(int bench) {
		this.bench = bench;
	}

	public int getDead() {
		return dead;
	}

	public void setDead(int dead) {
		this.dead = dead;
	}

	public int getSquat() {
		return squat;
	}

	public void setSquat(int squat) {
		this.squat = squat;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void healthInfo() {
		System.out.printf("이름: %s  벤치프레스: %d  데드리프트: %d  스쿼드: %d\n  삼대: %d" 
				, name, bench, dead, squat, total);
	}
	
}
