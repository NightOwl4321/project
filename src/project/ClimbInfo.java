package project;

class ClimbInfo {

	public String peakName;
	public int climbTime;
	public ClimbInfo(String peakName, int climbTime) {
		this.climbTime = climbTime;
		this.peakName = peakName;
	}
	public String getName() {
		return peakName;
	}
	public int getTime() {
		return climbTime;
	}
	public void setName(String newName) {
		peakName = newName;
	}
	public void setTime(int newTime) {
		climbTime = newTime;
	}

}


