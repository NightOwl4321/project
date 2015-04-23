package project;

import java.util.ArrayList;

public class ClimbingClub {

	ArrayList<ClimbInfo> climbList = new ArrayList<ClimbInfo>();

	public ArrayList<ClimbInfo> getClimbList() {
		return climbList;
	}

	// public void addClimb(String peakName, int climbTime) {
	// climbList.add(new ClimbInfo(peakName, climbTime));
	// }
	public void addClimb(String peakName, int climbTime) {

		for (int i = 0; i < climbList.size(); i++) {
			if (peakName.compareTo(climbList.get(i).getName()) <= 0) {
				climbList.add(i, new ClimbInfo(peakName, climbTime));
				return;
			}

		}
		climbList.add(0, new ClimbInfo(peakName, climbTime));
	}
}
