package model;

import java.util.List;

public class Station {
	private final static int infinite_dis = Integer.MAX_VALUE;
	
	private String name;  //����վ����
	private boolean known; //�˽ڵ�֮ǰ�Ƿ���֪
	private int adjuDist; //�˽ڵ����
	private Station parent; //��ǰ�ӳ�ʼ�ڵ㵽�˽ڵ�����·���µĸ��ڵ㡣
	public String Line;
	
	public Station()
	{
		this.known = false;
		this.adjuDist = infinite_dis;
		this.parent = null;
	}
	
	public Station(String name)
	{
		this.known = false;
		this.adjuDist = infinite_dis;
		this.parent = null;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isKnown() {
		return known;
	}
	public void setKnown(boolean known) {
		this.known = known;
	}
	public int getAdjuDist() {
		return adjuDist;
	}
	public void setAdjuDist(int adjuDist) {
		this.adjuDist = adjuDist;
	}
	
	public Station getParent() {
		return parent;
	}

	public void setParent(Station parent) {
		this.parent = parent;
	}
	
	public static Station getStation(List<Station> stationList,String stationname) {
		for(Station sta:stationList) {
			if(sta.name.equals(stationname))
				return sta;
		}
		return null;
	}
	
}
