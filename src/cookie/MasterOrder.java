package cookie;

import java.util.ArrayList;

public class MasterOrder {
	ArrayList<CookieOrder> orderList;

	MasterOrder() {
		orderList = new ArrayList<CookieOrder>();
	}

	public void setOrderList() {

	}

	public ArrayList<CookieOrder> getOrders() {
		return orderList;
	}

	public void addOrder(CookieOrder cookieOrder) {
		orderList.add(cookieOrder);
	}

	public int getTotalBoxes() {
		int boxes = 0;
		for (int i = 0; i < orderList.size(); i++) {
			boxes += orderList.get(i).getNumBoxes();
		}
		return boxes;
	}

	public int removeVariety(String variety) {
		int removed = 0;
		for (int i = orderList.size() - 1; i > 0 - 1; i--) {
			if (orderList.get(i).getVariety().equals(variety)) {
				removed += orderList.get(i).getNumBoxes();
				orderList.remove(i);
			}
		}
		return removed;

	}
}
